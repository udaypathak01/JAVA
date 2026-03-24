package string;

public class reverseWords {
    public static void main(String[] args) {
        String s = "uday   pathak is a good guy";
        String[] str = s.split(" +");
        int i = 0, j = str.length - 1;
        while (i <= j) {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        String str2 = String.join(" ", str);
        System.out.println(str2.trim());
    }

}
