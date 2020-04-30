import javax.swing.*;

public class StretchWith2Vowels {
    public static int matchCount(String sentence) {
        int count = 0;
        for (String word : sentence.split(" +")) {
            if (matches(word)) {
                count++;
            }
        }
        return count;
    }

    public static boolean matches(String word) {
        int count = 0;
        for (String sentence : word.split("z")) {
            if (vowelCount(sentence) == 2 ){
                return true;
            }
        }
        return false;
    }

    public static int vowelCount(String part) {
        int count = 0;
        for (int i = 0; i < part.length(); i ++) {
            if (isVowel(part.charAt(i))){
                count++;
            }
        }
        return count;
    }


    public static boolean isVowel(char c){
        return "aeiou".contains("" + c);
    }

    public static String readString() {
        System.out.print("sentence: ");
//        String sentence = In.nextLine();

        return In.nextLine();


    }

    public static void main(String[] args) {
        String temp = "";
        while (!(temp.equals("*"))){
            if (temp == "")temp = readString();
            else {
                System.out.println("Matching words = " + matchCount(temp.toLowerCase()));
                temp = readString();
            }

        }


    }
}
