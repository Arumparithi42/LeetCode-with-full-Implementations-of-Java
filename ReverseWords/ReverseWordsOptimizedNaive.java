public class ReverseWordsOptimizedNaive { // StringBuilder is mutable
    public String reverseWords(String sentence) {
        StringBuilder string = new StringBuilder();
        int i = sentence.length() -1 ;
        int j;
        while(i >= 0){
            while(i>=0 && sentence.charAt(i) == ' '){
                i--;
            }
            j = i;
            while(i>=0 && sentence.charAt(i) != ' '){
                i--;
            }
            if(!string.isEmpty())
                string.append(" ");
            string.append(sentence,i+1,j+1);
        }
        return string.toString();
    }
    public static void main(String[] args) {
        System.out.println(new ReverseWordsOptimizedNaive().reverseWords("We Love Python"));
    }
}
