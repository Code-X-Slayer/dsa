public class Divide {
    public static int divide(int dividend, int divisor) {
        long long_dividend = dividend;
        long long_divisor = divisor;
        boolean negative = (dividend<0)^(divisor<0);
        long_dividend = Math.abs(long_dividend);
        long_divisor = Math.abs(long_divisor);
        long quotient = 0;
        while(long_dividend>=long_divisor){
            long curr_divisor = long_divisor;
            long multiple = 1;
            while((curr_divisor<<1)<=long_dividend){
                curr_divisor<<=1;
                multiple<<=1;
            }
            long_dividend-=curr_divisor;
            quotient+=multiple;
        }
        if(negative) {quotient = -quotient;}
        if(quotient<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(quotient>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int)quotient;
    }
}
