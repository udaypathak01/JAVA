package string;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String str="uday pathak";
        System.out.println(findLength(str));
    }
    static int findLength(String s) {
        // code here
        String str=s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                return count;
            }
            count++;
        }
        return count;
    }
}
