public class AlternatingBits {
    public static boolean alternatingBits(int n){
        int b = n&1;
        n>>=1;
        while(n>0){
            if(b==(n&1)) {return false;}
            b^=1;
            n>>=1;
        }
        return true;        
    }
}
