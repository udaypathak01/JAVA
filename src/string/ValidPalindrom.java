package string;

public class ValidPalindrom {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        String str=s.toLowerCase().replaceAll("[^a-z0-9+]","");
        int i=0,j=str.length()-1;
        System.out.println(str);
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
