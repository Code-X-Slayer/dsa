class FirstUppercaseLetter {
    private static char firstUpperCase(String s, int idx) {
        if (idx == s.length())
            return '#';
        if (s.charAt(idx) >= 'A' && s.charAt(idx) <= 'Z') {
            return s.charAt(idx);
        }
        return firstUpperCase(s, idx + 1);
    }

    public static void main(String[] args) {
        System.out.println(firstUpperCase("abcdefG", 0));
        System.out.println(firstUpperCase("abcdef", 0));
    }
}