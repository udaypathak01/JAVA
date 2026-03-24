package string;

public class FirstOccOfStr {
    public static void main(String[] args) {
        String s="sdbutsad";
        System.out.println(strByMethod(s,"sad"));
    }
    public static int strByMethod(String str, String needle) {
        if(str.contains(needle)){
            return str.indexOf(needle);

        }else return -1;
    }
}
