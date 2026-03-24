package string;

import java.util.Scanner;

public class stringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        //mutable strings


        System.out.println(s.append(" world"));
        System.out.println(s.length());
        System.out.println(s.capacity());
        System.out.println(s.indexOf("l"));
        System.out.println(s.reverse());
        System.out.println(s.insert(2, "*"));

    }
}
