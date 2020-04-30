
public class studyFour {

    // Proceedure
    public static void showCircule(){
        double radius;
        System.out.print("Enter the radius of the Circle: ");
        radius = In.nextInt();
        double area = (Math.PI * radius * radius);
        System.out.println("The area of the circle is: " + area);
    }

    // Function (note the return type)

    public static double circleArea(double radius){
        double area = (Math.PI * radius * radius);
        return area;
    }


    public static boolean anyNegative(int[] array){
        for (int item : array)
            if (item < 0)
                return true;
            return false;
    }

    String readThis(){
            System.out.print("String: ");
            return In.nextString();
    }

    public static void main(String[] args){
        String s = "Hello Worlds!";
        String[] words = s.split(" +");
        int[] arr = {1,2,3,4};



        int count = 0;
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(words[0]);


        for (int i = 0; i < s.length(); i ++){
            System.out.println(s.charAt(i));
            System.out.println();
            if (s.charAt(i) == 'l'){
                count ++;
            }
        }
        System.out.println("The total number of L's is: " + count);
        System.out.println();
        System.out.println();

        // For each loop with string
        for(String test:words)
            System.out.println(test);

        // For each loop with int
        for(int test:arr)
            System.out.println(test);

        // looping over words in a string using split

        String sentence = "Eat your vegetables";
        String hi = "Eat";

        for (String word:sentence.split(" +")){
            System.out.println("Next word is: " + word);
//            System.out.println(word.indexOf(word[word]));
            if (word.equals(hi)){
                System.out.println("Hi their");
            }

        }


//        System.out.println(boolean(0));

//        while (!(z = In.nextString()).equals("end")){
//            System.out.println("nice one: \n");
//        }





    }

}
