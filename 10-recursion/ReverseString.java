class ReverseString {
    private void helper(char[] s, int idx) {
        if (idx >= s.length / 2) {
            return;
        }
        char temp = s[idx];
        s[idx] = s[s.length - 1 - idx];
        s[s.length - 1 - idx] = temp;
        helper(s, idx + 1);
    }

    public void reverseString(char[] s) {
        helper(s, 0);
    }
}