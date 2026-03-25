package string;

public class binaryString {
    public static void main(String[] args) {
        String sp = "1111";
        System.out.println(binarySubstring(sp));
    }
    public static int binarySubstring(String s) {
        // code here
        int count = 0;

        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count*(count-1)/2;
    }
}
