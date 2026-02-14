package string;

public class changeTheString {
    public static void main(String[] args) {
        String s = "AbCD";

       if (s.charAt(0)>=(char)97){
           System.out.print(s.toLowerCase());
       }else if (s.charAt(0)<=(char)97){
           System.out.print(s.toUpperCase());

       }
    }
}
