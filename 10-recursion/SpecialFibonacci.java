import java.util.Scanner;

public class SpecialFibonacci {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int mod = n % 3;
            if (mod == 0) {
                System.out.println(a);
            } else if (mod == 1) {
                System.out.println(b);
            } else {
                System.out.println(a ^ b);
            }
        }
        sc.close();
    }
}

// class Recursion
// {
// private static int helper(int n, HashMap<Integer, Integer> memo){
// if(n<0) {return 0;}
// if(memo.containsKey(n)) {return memo.get(n);}
// memo.put(n, helper(n-1, memo)^helper(n-2, memo));
// return memo.get(n);
// }
// public static void main (String[] args) throws java.lang.Exception
// {
// // your code goes here
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while(t>0){
// t--;
// int a = sc.nextInt();
// int b = sc.nextInt();
// int n = sc.nextInt();
// HashMap<Integer, Integer> memo = new HashMap<>();
// memo.put(0, a);
// memo.put(1, b);
// System.out.println(helper(n, memo));
// }

// }
// }
