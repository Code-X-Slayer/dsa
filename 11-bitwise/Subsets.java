import java.util.List;
import java.util.ArrayList;

public class Subsets {
    private static List<Integer> set(int[] nums, int n){
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if((n&1)==1) {res.add(nums[i]);}
            n>>=1;
        }
        return res;
    }
    public static List<List<Integer>> subsets(int[] nums) {
        int x = 0, boundary = 1<<nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        while(x<boundary){
            res.add(set(nums, x++));
        }   
        return res;
    }
}