package string;

public class anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] hash = new int[26];
        boolean res = true;
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
            hash[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0)
                return false;

        }
        return res;
    }


}
