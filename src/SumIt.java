public class SumIt {

    public static void main(String[]args){

        System.out.print("Enter a value: ");
        int value = In.nextInt();
        int[] count = new int[10];
        int i = 0;


        while (value != -1  && value < 60){
            if (value < 100)
                count[value/10]++;
                System.out.print("Enter a value: ");
                value = In.nextInt();
        }

        for (i = 0; i < count.length; i ++)
            System.out.println(i + "0's: " + count[i]);
            System.out.println(19 % 10);
    }

}
