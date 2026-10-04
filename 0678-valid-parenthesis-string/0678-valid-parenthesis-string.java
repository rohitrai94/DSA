class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        // dp[i][j] represents if the substring starting from index i is valid with j opening brackets
        boolean[][] dp = new boolean[n + 1][n + 1];

        // base case: an empty string with 0 opening brackets is valid
        dp[n][0] = true;

        for (int index = n - 1; index >= 0; index--) {
            for (int openBracket = 0; openBracket < n; openBracket++) {
                boolean isValid = false;

                // '*' can represent '(' or ')' or '' (empty)
                if (s.charAt(index) == '*') {
                    isValid |= dp[index + 1][openBracket + 1]; // try '*' as '('
                    // opening brackets to use '*' as ')'
                    if (openBracket > 0) {
                        isValid |= dp[index + 1][openBracket - 1]; // try '*' as ')'
                    }
                    isValid |= dp[index + 1][openBracket]; // ignore '*'
                } else {
                    // If the character is not '*', it can be '(' or ')'
                    if (s.charAt(index) == '(') {
                        isValid |= dp[index + 1][openBracket + 1]; // try '('
                    } else if (openBracket > 0) {
                        isValid |= dp[index + 1][openBracket - 1]; // try ')'
                    }
                }
                dp[index][openBracket] = isValid;
            }
        }

        return dp[0][0]; // check if the entire string is valid with no excess opening brackets
    }
}