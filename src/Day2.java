import java.util.Scanner;

public class Day2 {
public static void main(String[] args) {
  /*  int i=0;
    do{
        System.out.println(i);
        i++;
    }while(i<=5);

   */



  /*  int i=1;
    while(i<=0){
        System.out.println(i);
        i++;
    }

   */

  /*  double[] myList = {1.9, 2.9, 3.4, 3.5};
// Print all the array elements
    for (int i = 0; i < myList.length; i++) {
        System.out.println(myList[i] + " ");
    }
// Summing all elements
    double total = 0;
    for (int i = 0; i < myList.length; i++) {
        total += myList[i];
    }
    System.out.println("Total is " + total);
// Finding the largest element
    double max = myList[0];
    for (int i = 1; i < myList.length; i++) {
        if (myList[i] > max) max = myList[i];
    }
    System.out.println("Max is " + max);

   class EvenPosition {
        public static void main(String[] args)
        {
            // declaration and initialization of array.
            int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };

            // iterating through the array using for loop
            for (int i = 1; i < arr.length; i = i + 2) {

                // print element to the console
                System.out.println(arr[i]);
            }
        }
    }

   */

    int a = 7;
    int[] num = new int[a];

    Scanner sc = new Scanner(System.in);
    System.out.println("Display the elements of array");
    for (int i=0; i<num.length;i++){
        num[i] =sc.nextInt();
    }

    for (int i=0; i<a;i++){
        for (int j= a+1; j<a; j++){
            if (num[i]<num[j]){
                int temp = num[i];
                num[i]=num[j+1];
                num[j]=temp;

            }
        }
    }

    System.out.println("Sorted array");
    for (int i =0; i<num.length; i++){
        System.out.println(num[i]);
    }
}
}



