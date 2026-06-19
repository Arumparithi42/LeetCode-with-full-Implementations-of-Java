public class SingleNumberI {
    int singleNumber(int[] array){
        int ans = 0;
        for (int num : array){
            ans ^= num;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(new SingleNumberI().singleNumber(new int[] {2,1,4,1,2}));

    }    
}
