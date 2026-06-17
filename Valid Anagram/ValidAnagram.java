/*
Note : Here only small alphabets are allowed hence array is used, otherwise HashMap is best 
 */
public class ValidAnagram { // Counter
    boolean isAnagram(String s, String t){
        if (s.length() != t.length())
            return false;
        char[] freq = new char[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int ch : freq)
            if (ch != 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();

        System.out.println(obj.isAnagram("anagram", "nagaram"));
        // int a = 'a';
        // System.out.println(a);

        /* 
        // One Line in Python
        return Counter(s) == Counter(t) 
        */
    }
}
