import java.util.Arrays;

public class SortByBits {
    private static int setbits(int num){
        int res = 0;
        while(num>0){
            num=num&(num-1);
            res++;
        }
        return res;
    }
    public static int[] sortByBits(int[] arr){
        int n = arr.length;
        int[][] pair = new int[n][2];
        for(int i=0; i<n; i++){
            pair[i][0] = arr[i];
            pair[i][1] = setbits(arr[i]);
        }
        Arrays.sort(pair, (a,b) -> {
            if(a[1]!=b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });
        for(int i=0; i<n; i++){
            arr[i] = pair[i][0];
        }
        return arr;
    }
}
