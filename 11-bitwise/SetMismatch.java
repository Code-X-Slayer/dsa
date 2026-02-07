public class SetMismatch {
    public static int[] setMismatch(int[] nums){
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor^=nums[i];
            xor^=(i+1);
        }
        int rightMostSetBit = xor&(-xor);
        int x = 0, y = 0;
        for(int num: nums){
            if((num&rightMostSetBit)==0) {x^=num;}
            else {y^=num;}
        }
        for(int i=1; i<=nums.length; i++){
            if((i&rightMostSetBit)==0) {x^=i;}
            else {y^=i;}
        }
        for(int num: nums){
            if(num==x) {return new int[]{x,y};}
        }
        return new int[]{y,x};
    }
}