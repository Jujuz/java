public class Vowels {
    public static int matchingWords(String sentence){
        int count = 0;
        for (String word: sentence.split(" +"))
            if (anyVowels(word))
                count ++;
        return count;
    }

    public static boolean anyVowels(String word){
        for (int i = 0; i < word.length(); i ++)
            if (isVowel(word.charAt(i)))
                return true;
        return false;
    }

    public static boolean isVowel(char c){
        return "aeiou".equals("" + c);
    }

    public static String readSentence(){
        System.out.print("Enter a sentence: ");
        String sentence = In.nextString();
        return (sentence);
    }

    public static void main(String[] args) {
        System.out.println("The total number of lowercase vowels in the sentence is: " + matchingWords(readSentence()));
    }

}
