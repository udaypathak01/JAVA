package string;

import java.util.ArrayList;
import java.util.Scanner;

public class reverseLettersOfwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        String[] arr = s.split("[ ,.]");

        ArrayList<String> temp=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            StringBuilder sr = new StringBuilder(arr[i]);
            temp.add(i,sr.reverse().toString());

        }
        System.out.println(String.join(" ",temp));
    }
}
