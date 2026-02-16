import java.util.*;

class SumOfTraingle {
    private static void get(int[] a) {
        if (a.length == 0) {
            return;
        }
        int[] n = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            n[i] = a[i] + a[i + 1];
        }
        get(n);
        System.out.println(Arrays.toString(a));
        return;
    }

    public static void main(String[] args) {
        get(new int[] { 1, 2, 3, 4, 5 });
    }
}