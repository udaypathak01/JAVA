package string;

public class RepeatCharInStr {
    public static void main(String[] args) {
        int[] arr = new int[26];
        String str="abcabaca";
        for (int i = 0; i <str.length() ; i++) {
            arr[str.charAt(i)-'a']++;
        }

        for (int i = 0; i <arr.length ; i++) {
           if (arr[i]>0){
               System.out.print(arr[i]+" ");
           }
        }
    }
}
