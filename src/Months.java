public class Months {
    public static void main(String[] args){
        int[] months = {31, 30, 29, 30, 31};
        int sum = 0;

    for (int i = 0; i < months.length; i++) {
        sum += months[i];
    }

        double avg = (double)sum / (double)months.length;
        System.out.println("the average number of months is: " + avg);
    }

}
