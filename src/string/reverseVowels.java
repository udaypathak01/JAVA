package string;

public class reverseVowels {

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {

        StringBuilder sc = new StringBuilder(s);
        int i = 0, j = s.length() - 1;
        while (i <= j)
            if (isVowel(sc.charAt(i)) && isVowel(sc.charAt(j))) {
                char temp=sc.charAt(i);
                sc.setCharAt(i,sc.charAt(j));
                sc.setCharAt(j,temp);
                i++;
                j--;
            }else if(!isVowel(sc.charAt(i))){
                i++;
            }else{
                j--;
            }


        System.out.println(sc);
        return " ";
    }

    public static boolean isVowel(char s) {
        return "aeiouAEIOU".indexOf(s) != -1;
    }
}
