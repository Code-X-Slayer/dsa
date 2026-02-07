public class BinaryGap {
    public static int binaryGap(int n){
        int lastPos = -1;
        int idx = 0;
        int res = 0;
        while(n>0){
            if((n&1)==1){
                if(lastPos!=-1){
                    res = Math.max(res, idx-lastPos);
                }
                lastPos = idx;
            }
            idx++;
            n>>=1;
        }
        return res;        
    }
}
