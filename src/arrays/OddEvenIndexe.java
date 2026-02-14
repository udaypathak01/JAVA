package arrays;
//index-odd->mul by 2 in element
//index-even->add 10 in element

import java.util.Scanner;

public class OddEvenIndexe {

    //main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("enter elements of array: ");
        //input the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        OddEvenIndexe(arr);
    }

    //main logic of OddEvenIndexe
    public static void OddEvenIndexe(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += 10;
            } else {
                arr[i] *= 2;
            }
        }
        print(arr);

    }

    //function for printing the array
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
