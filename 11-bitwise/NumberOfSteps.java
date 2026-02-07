public class NumberOfSteps {
    public static int numberOfOneBits(int num){
        if(num==0) {return 0;}
        int digits = (int)(Math.log(num)/Math.log(2))+1;
        int setbits = 0;
        while(num>0){
            num=num&(num-1);
            setbits++;
        }
        return setbits*2+(digits-setbits)-1;
    }
}
