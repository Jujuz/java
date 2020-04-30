import java.util.*;

public class Store {
    private CashRegister cashRegister;
    private LinkedList<Product> products = new LinkedList<Product>();

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
        String prodName = readName().toLowerCase();
        System.out.println("Selling " + product(prodName).getName());
        System.out.print("Number: ");
        int prodStock = In.nextInt();

        if (!product(prodName).has(prodStock))
            System.out.println("Not enough stock");
        double amountSold = product(prodName).sell(prodStock);
        cashRegister.add(amountSold);
    }

    private void restock() {
        String prodName = readName();
        System.out.println("Restocking " + product(prodName).getName());
        System.out.print("Number: ");
        int prodStock = In.nextInt();
        product(prodName).restock(prodStock);


    }

    private Product product(String name) {
        for (Product product : products)
            if (product.hasName(name))
                return product;
        return null;
    }

    private Product product(int n) {
        for (Product product : products)
        if (product.has(n))
            return product;
        return null;
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
        String name = In.nextLine();
        return name;
    }

    private double readPrice() {
        System.out.print("Price: $");
        return In.nextDouble();
    }

    private int readNumber() {
        System.out.print("Number: ");
        int amount = In.nextInt();
        return amount;
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
