package string.college;

public class RepeatCharInStr {
    public static void main(String[] args) {
        int[] arr = new int[26];
        String str="abcabaca";
        for (int i = 0; i <str.length() ; i++) {
            arr[str.charAt(i)-'a']++;
        }

        for (int i = 0; i <arr.length ; i++) {
           if (arr[i]>1){
               System.out.print(((char)(i+'a'))+" ");
           }
        }
    }
}
