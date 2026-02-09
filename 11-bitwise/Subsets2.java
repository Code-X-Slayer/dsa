import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets2 {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>(1<<nums.length);
        backtrack(0, nums, new ArrayList<>(), res);
        return res;
    }
    private void backtrack(int start, int[] nums, List<Integer> curr, List<List<Integer>> res){
        res.add(new ArrayList<>(curr));
        for(int i=start; i<nums.length; i++){
            if(i>start && nums[i]==nums[i-1]) {continue;}
            curr.add(nums[i]);
            backtrack(i+1, nums, curr, res);
            curr.remove(curr.size()-1);
        }
    }
}
