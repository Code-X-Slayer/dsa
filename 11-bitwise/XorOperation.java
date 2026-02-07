public class XorOperation {
    private static int xor(int n){
        int mod = n%4;
        if(mod==0) {return n;}
        else if(mod==1) {return 1;}
        else if(mod==2) {return n+1;}
        else {return 0;}
    }
    public static int xorOperation(int n, int start){
        int lastbit = start&1;
        int startRes = start>>1;
        int res = xor(startRes+n-1)^xor(startRes-1);
        return (res<<1)^(lastbit*(n&1));
    }
}
