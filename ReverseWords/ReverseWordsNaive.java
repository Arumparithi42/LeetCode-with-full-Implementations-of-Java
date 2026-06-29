public class ReverseWordsNaive { // My First Own Solution
    public String reverseWords(String sentence) {
        int i = 0, j = 0;
        boolean flag = true;
        String string = "";
        while(i < sentence.length()){
            while(i != sentence.length() && sentence.charAt(i) == ' ' ){
                i++;
            }
            j = i;
            while(i != sentence.length() && sentence.charAt(i) != ' ')
                i++;
            String word = sentence.substring(j, i);
            /* String word = "";
            for(; j < i;j++){
                word += sentence.charAt(j);
            } */
            if(word == "")
                continue;
            if (flag){
                string = word;
                flag = false;
            }
            else{
                string = word + ' ' + string;
            }            
        }
        return string;
    }
    public static void main(String[] args) {
        System.out.println(new ReverseWordsNaive().reverseWords("We Love Python"));
    }
}
