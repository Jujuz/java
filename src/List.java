import java.util.*;

public class List {
    private String name;
    private String number;
    private String address;
    private String item;
    private LinkedList<String> list = new LinkedList<>();

    public static void main(String[] args){
        new List().menu();
    }

    private char readChoice() {
        System.out.print("Choice (a/r/v/c/x): ");
        return In.nextChar();
    }
//
    public void menu(){
        char choice;
        while ((choice = readChoice()) != 'x'){
            switch(choice){
                case 'a' : addToList();break;
                case 'r' : removeFromList();break;
                case 'v' : viewList();break;
                case 'c' : contains();
                default : help();break;
            }
        }
    }

    private void addToList() {
        System.out.print("Enter the name of a List Object: ");
        String addThis = readString();
        list.add(addThis);
        System.out.println(list);
    }

    private void removeFromList() {
        System.out.print("Enter an object to remove: ");
        String removeThis = readString();
        list.remove(removeThis);
        System.out.println(list);
    }

    private void viewList() {
        for (String list : list){
            System.out.println(list);
        }

    }
    private void help(){
        System.out.println("help");
    }

    private String readString() {
        return In.nextLine();
    }

    private void contains() {
        System.out.print("Enter a like String: ");
        String containsThis = readString();

        for (String list : list){
            if (list.contains(containsThis)) {
                System.out.println("We have a match");
            }
            else
                System.out.println("no match");

        }
    }
//    @Override
//    public String toString() {
//        return name
//    }
}
