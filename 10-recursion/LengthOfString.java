public class LengthOfString {
    private static int helper(String s, int index) {
        try {
            char ch = s.charAt(index);
        } catch (Exception e) {
            return 0;
        }
        return 1 + helper(s, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(helper("abcd", 0));
    }
}
