import java.util.*;

public class List {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("i'm");
        list.add("here");

        // sets and overwrites position i
        list.set(0, "bye");
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.get(0));
    }


}
