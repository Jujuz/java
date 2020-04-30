public class MaxCard {
    public static void main(String[] args) {
        int max = 0;
        int count = 0;

        System.out.println("enter card number: ");
        int card = In.nextInt();

        while (card != -1) {
            count ++;
            if (card > max)
                max = card;
            System.out.print("Enter card number: ");
            card = In.nextInt();
        }
        System.out.println("The MAX number recorded was: " + max + " the number of iterations for the loop was: " + count);
    }
}