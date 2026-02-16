class Print1ToN {
    private void helper(int n) {
        if (n == 0) {
            return;
        }
        helper(n - 1);
        System.out.print(n + " ");
    }

    public void printNos(int n) {
        // Code here
        helper(n);
    }
}
