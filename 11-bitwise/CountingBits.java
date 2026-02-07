public class CountingBits {
    public static int[] countingBits(int n){
        int[] res = new int[n+1];
        for(int i=1; i<=n; i++){
            res[i] = 1 + res[i&(i-1)];
        }
        return res;
    }
}
