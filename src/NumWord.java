public class NumWord {

    public static void main(String[] args) {

        int num, temp, digit, count = 0;


        String[] str;

        String[] stArr1 = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] stArr2 = new String[] {"ten", "teen","twenty","ty"};

        System.out.print("Number: ");
        num = In.nextInt();
        temp = num;

            while (num > 0) {

                num = num / 10;
                // count is position of number
                count++;
            }

            while (temp > 0) {
                digit = temp % 10;
                System.out.println(stArr1[digit]);
                System.out.println("Position is: " + count );
                temp = temp / 10;
                count--;

            }


    }

}
