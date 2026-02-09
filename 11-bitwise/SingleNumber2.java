public class SingleNumber2 {
    private static void func(int num, int[] bits){
        for(int i=0; i<32; i++){
            if((num&1)==1) {bits[i]++;}
            num>>=1;
        }
    }
    private static int construct(int[] bits, int k){
        int res = 0;
        for(int i=31; i>=0; i--){
            res<<=1;
            if(bits[i]%k==0) {continue;}
            res|=1;
        }
        return res;
    }
    public static int singleNumber(int[] nums) {
        int[] bits = new int[32];
        for(int num : nums){
            func(num, bits);
        }
        return construct(bits, 3);
    }
}
