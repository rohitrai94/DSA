class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();

        long[][] dp = new long[m + 1][n + 1];

        // Empty target can always be formed
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                // Skip current character of s
                dp[i][j] = dp[i - 1][j];

                // Use current character if it matches
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }

        return (int) dp[m][n];
    }
}