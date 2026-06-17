import java.util.HashMap;

public class ValidAnagramHashMap {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap <Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : t.toCharArray()){
            int f = map.getOrDefault(ch, 0);
            if (f == 0)
                return false;
            map.put(ch, f - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        ValidAnagramHashMap obj = new ValidAnagramHashMap();
        System.out.print(obj.isAnagram("anagram", "nagaram"));
    }
}
