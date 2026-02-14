package string.college;

public class anagram {
    public static void main(String[] args) {
        String str1 = "geeks";
        String str2 = "kseeg";
        System.out.println(areAnagrams(str1, str2));
    }

    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if (s1.length() != s2.length()) return false;
        boolean flag = true;
        int[] hash = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            hash[s1.charAt(i) - 'a']++;
            hash[s2.charAt(i) - 'a']--;
        }
        for (int i = 0; i <hash.length ; i++) {
            if (hash[i]!=0){
                flag=false;
            }
        }

        return flag;
    }
}
