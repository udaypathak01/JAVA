package string;

import java.util.Scanner;

public class basicsOfString {
    public static void main(String[] args) {

        String s = "Uday";//initailization
        Scanner sc = new Scanner(System.in);
        //string in function passing
        print(s);

        String m = sc.next();//take input till space
        String k = sc.nextLine();//take input all the paragraph

    }

    //    funciton
    public static void print(String s) {
        System.out.print(s);
    }
}
