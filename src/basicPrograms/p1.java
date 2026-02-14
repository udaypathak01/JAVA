package basicPrograms;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a number to check: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("zero");
        } else if (n < 0) {
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }
    }
}
