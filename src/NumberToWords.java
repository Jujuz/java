public class NumberToWords {

    // Used to get a number from the user
    private static int getNumber(){
        System.out.print("Number: ");
        int number = In.nextInt();

        return (number);

    }

    private static int getLength(int num){
        int count =0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        return (count);

    }

    private static String zeros(int num){

        String[] stArr1 = new String[] {"","one","two","three","four","five","six","seven","eight","nine"};
        return (stArr1[num]);
    }

    private static String tens(int num2){
        String[] stArr2 = new String[] {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        return (stArr2[num2]);

    }

    private static String aboveTens(int num2){
        String[] stArr2 = new String[] {"", "", "twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        return (stArr2[num2]);

    }

    public static void main(String[] args){
        int count =0, position, tempnum = 0, len;
        String word = "";
        // boundary loop
        while (tempnum != -1 && tempnum < 1000 ) {
            tempnum = getNumber();
            len = getLength(tempnum);

            // Numbers from 0 - 9
            if (len == 1 || tempnum == 0){
                if (tempnum == 0){
                    System.out.println("zero");
                }
                else System.out.println(zeros(tempnum));
            }

            // Numbers from 10 - 19
            if (tempnum < 20 && len ==2 ){
                System.out.println(tens(tempnum%10));
            }

            // Numbers from 20 - 99
            if (tempnum > 19 && len ==2 ){
                if (tempnum % 10 != 0 ) word = " ";
                System.out.println(aboveTens(tempnum/10) + word + zeros(tempnum % 10));
            }

            // Numbers from 100 - 999
            if (len == 3){
                // 100 - 119
                System.out.print(zeros(tempnum/100) + " hundred");
                if (tempnum / 10 % 10 == 1) {
                    System.out.print(" and " + tens(tempnum % 10));
                }
                // 120 - 999
                else if(tempnum / 10 % 10 > 1){
                    if (tempnum % 10 != 0 ) word = " ";
                    System.out.print(" and " + aboveTens(tempnum/10 %10) + word + (zeros(tempnum%10)));

                }
                // 100 - 109
                else
                    if (tempnum /10 % 10 == 0 && tempnum % 10 != 0)
                    System.out.print(" and " + zeros(tempnum % 10));

                System.out.println();
            }

        }

    }

}
