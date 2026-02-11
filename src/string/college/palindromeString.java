package string;

import java.util.*;

public class palindromeString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your string here: ");
        String str = s.nextLine();

        int left = 0;
        int right = str.length() - 1;
        boolean p = false;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
                p = true;
            } else {
                p = false;
                break;
            }
        }

        if (p) {
            System.out.print("your string is palindrome");
        } else {
            System.out.print("your string is not palindrome");
        }
    }


}
