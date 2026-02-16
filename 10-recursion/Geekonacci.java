import java.util.*;

class Geekonacci {
	private static int helper(int n, HashMap<Integer, Integer> memo) {
		if (memo.containsKey(n)) {
			return memo.get(n);
		}
		memo.put(n, (helper(n - 1, memo) + helper(n - 2, memo) + helper(n - 3, memo)));
		return memo.get(n);
	}

	public static void main(String[] args) {
		// code here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			t--;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int n = sc.nextInt();
			HashMap<Integer, Integer> memo = new HashMap<>();
			memo.put(1, a);
			memo.put(2, b);
			memo.put(3, c);
			System.out.println(helper(n, memo));
		}
		sc.close();
	}
}