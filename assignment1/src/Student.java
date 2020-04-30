import java.util.*;
public class Student {
    private String number;
    private String name;
    private LinkedList<Activity> activities = new LinkedList<Activity>();
    // view my activities
// enrol
// withdraw
    public Student(){
        number = readNum();
        name = readName();

//        this.activities.add(activity);
    }

    public void use() {
        char choice;
        while ((choice = readChoice()) != 'x') {
            switch(choice) {
                case 'a': help(); break;
                case 'b': help(); break;
                default: help(); break;
            }
        }
    }

    private void help() {
        System.out.println("Help A");
        System.out.println("Help B");
    }

    private char readChoice() {
        System.out.print("Choice (a/b/x): ");
        return In.nextChar();
    }

    private String readNum() {
        System.out.print("Number: ");
        return In.nextLine();
    }

    private String readName() {
        System.out.print("Name: ");
        return In.nextLine();
    }

    public String getNum() {
        return number;
    }

    public String getName() {
        return name;
    }
    public boolean hasNum(String type) {
        return type.equals(this.number);
    }
    @Override
    public String toString() {
        return number + " " + name;
    }

}
