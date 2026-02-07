import java.util.HashSet;
import java.util.Arrays;

public class CountPrimeSetBits {
    private static int setbits(int n){
        int res = 0;
        while(n>0){
            res++;
            n=n&(n-1);
        }
        return res;
    }
    public static int countPrimeSetBits(int left, int right){
        HashSet<Integer> primes = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19,23,29,31));
        int res = 0;
        for(int i=left; i<=right; i++){
            if(primes.contains(setbits(i))) res++;
        }
        return res;        
    }
}
