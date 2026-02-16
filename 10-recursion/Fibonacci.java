import java.util.HashMap;

class Fibonacci {
    private int fibi(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, fibi(n - 1, memo) + fibi(n - 2, memo));
        return memo.get(n);
    }

    public int fib(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        memo.put(0, 0);
        memo.put(1, 1);
        return fibi(n, memo);
    }
}