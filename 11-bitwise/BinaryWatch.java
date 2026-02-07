import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    private static int getSetBits(int n){
        int res = 0;
        while(n>0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
    public static List<String> binaryWatch(int turnedOn){
        List<String> res = new ArrayList<>();
        for(int hour=0; hour<12; hour++){
            for(int min=0; min>60; min++){
                if(getSetBits(hour)+getSetBits(min)==turnedOn){
                    res.add(hour + ":" + (min<10?"0":"") + min);
                }
            }
        }
        return res;
    }
}
