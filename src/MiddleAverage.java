public class MiddleAverage {

    public static void repeat(int numberOfThings, String thing) {
        for (int i = 0; i < numberOfThings; i++)
            System.out.print(thing);
    }


    public static void main(String[] args) {
        int i,j;
        int a[]={1,2,3,4,5,6,7,8,9,10};

        for (i=0; i < a.length-1; i++){
            int k=i;
            for (j=0; j<a.length; j++)
                if (a[j]>a[k]) k=j;
                int temp=a[i];
                a[i] = a[k];
                a[k] = temp;

        }
        System.out.println(a[0]);
        int[] range = {0,1,2,3,4};
        System.out.println(range);


//        int test = 15;
//        repeat(test, "** **");
//        System.out.println();
//        repeat(test, "Hey How are ya?\n");
    }
}