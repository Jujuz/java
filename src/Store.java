import java.util.*;

public class Store {
    private CashRegister cashRegister;
    private LinkedList<Product> products = new LinkedList<>();

    public static void main(String[]args) {
        new Store().use();
    }

    public void use() {
        char choice;
        while ((choice = readChoice()) != 'x') {
            switch (choice) {
                case 's': sell(); break;
                case 'r': restock(); break;
                case 'v': viewStock(); break;
                case 'c': viewCash(); break;
                case 'p': pruneProducts(); break;
                default: help(); break;
            }
        }
    }

    public Store() {
        // Insert 6 lines of code to initialise the fields.
        cashRegister = new CashRegister();
        products.add(new Product("Whiteboard Marker", 85, 1.50));
        products.add(new Product("Whiteboard Eraser", 45, 5.00));
        products.add(new Product("Black Pen", 100, 1.50));
        products.add(new Product("Red Pen", 100, 1.50));
        products.add(new Product("Blue Pen", 100, 1.50));
    }

    private char readChoice() {
        System.out.print("Choice (s/r/v/c/p/x): ");
        return In.nextChar();
    }

    private void sell() {
        String name = readName().toLowerCase();
        int i = 0;
        int count = 0;
        for (Product product : products)
            if (product.getName().toLowerCase().equals(name.toLowerCase())) {
                System.out.println("Selling " + product.getName());
                int n = readNumber();
                double total = product.sell(n);
                cashRegister.add(total);

            } else if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                if (i == 0)
                    System.out.println("Multiple products match:");

                System.out.println(product.toString());
                i++;

            } else
                count++;
        if (count == products.size()) {
            System.out.println("No such product");
        }
    }

    private void restock() {
        String name = readName();
        int count = 0;
        int i = 0;

        for(Product product : products)
            if (product.getName().toLowerCase().contains(name.toLowerCase()))
            {System.out.println("Restocking "+ product.getName());
                int n = readNumber();
                product.restock(n);
            }
            else
                count++;
        if(count == products.size()){
            System.out.println("Adding new product");
            int stock = readNumber();
            double price = readPrice();
            products.add(new Product(name,stock,price));
        }
    }

    private void viewStock() {
        for (Product product : products)
            System.out.println(product);

    }

    private void viewCash() {
        System.out.println(cashRegister);
    }

    private LinkedList<Product> empty(LinkedList<Product> products){
        LinkedList <Product>matches = new LinkedList<>();
        for (Product product : products)
            if(product.isEmpty())
                matches.add(product);
        return matches;
    }

    private void pruneProducts() {
        LinkedList<Product>empty = empty(products);
        products.removeAll(empty);
    }

    private String readName() {
        System.out.print("Name: ");
        return In.nextLine();
    }

    private double readPrice() {
        System.out.print("Price: $");
        return In.nextDouble();
    }

    private int readNumber() {
        System.out.print("Number: ");
        return In.nextInt();
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("s = sell");
        System.out.println("r = restock");
        System.out.println("v = view stock");
        System.out.println("c = view cash");
        System.out.println("p = prune products");
        System.out.println("x = exit");
    }
}
