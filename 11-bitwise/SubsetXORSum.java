public class SubsetXORSum {
    private static int getXOR(int n, int[] nums){
        int xor=0;
        for(int num : nums){
            if((n&1)==1) {xor^=num;}
            n>>=1;
        }
        return xor;
    }
    public static int subsetXORSum(int[] nums) {
        int res=0, n=nums.length, x=1;
        x<<=n;
        for(int i=0; i<x; i++){
            res+=getXOR(i, nums);
        }
        return res;
    }    
}