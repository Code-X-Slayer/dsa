import java.util.*;

class MinMax {
    private static int helper1(int[] arr, int idx, int min) {
        if (arr.length == idx) {
            return min;
        }
        return Math.min(arr[idx], helper1(arr, idx + 1, min));
    }

    private static int helper2(int[] arr, int idx, int max) {
        if (arr.length == idx) {
            return max;
        }
        return Math.max(arr[idx], helper2(arr, idx + 1, max));
    }

    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here\
        ArrayList<Integer> res = new ArrayList<>();
        res.add(helper1(arr, 0, Integer.MAX_VALUE));
        res.add(helper2(arr, 0, Integer.MIN_VALUE));
        return res;
    }
}
