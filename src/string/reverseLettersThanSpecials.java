package string;

import java.util.*;

public class reverseLettersThanSpecials {
    public static void main(String[] args) {

        String s = ")ebc#da@f(";
        System.out.println(reverseByType(s));

    }

    public static String reverseByType(String s) {
        StringBuilder letter = new StringBuilder();
        StringBuilder specialChar = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (char val : s.toCharArray()) {
            if (Character.isLetterOrDigit(val)) {
                letter.append(val);
            } else {
                specialChar.append(val);
            }
        }
        letter.reverse();
        specialChar.reverse();

        int i = 0, j = 0;

        for (char val : s.toCharArray())
            if (Character.isLetterOrDigit(val)) {
                temp.append(letter.charAt(i++));
            } else {
                temp.append(specialChar.charAt(j++));
            }


        return temp.toString();
    }
}
