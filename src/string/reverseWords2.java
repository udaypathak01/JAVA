package string;

public class reverseWords2 {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        // Code here

        String[] str = s.split("\\.+");
        int i = 0, j = str.length - 1;
        while (i < j) {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        String str2 = String.join(".", str).replaceAll("^\\.+|\\.+$","");
        return str2;
    }
}
