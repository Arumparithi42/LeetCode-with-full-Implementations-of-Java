import java.util.Arrays;
public class ValidAnagramSorting {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        return Arrays.equals(chars, chart);
    }

    public static void main(String[] args) {
        ValidAnagramSorting obj = new ValidAnagramSorting();
        System.out.print(obj.isAnagram("anagram", "nagaram"));
    }
}
