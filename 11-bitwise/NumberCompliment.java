public class NumberCompliment {
    public static int numberCompliment(int n){
        int temp=n, mask=0;
        while(temp>0){
            temp>>=1;
            mask=(mask<<1)+1;
        }
        return (~n)&mask;
    }
}
