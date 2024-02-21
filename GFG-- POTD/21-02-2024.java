class Solution {
    static int[][][] dp;

    static int solve(String s, int i, int j, int isTrue) {
        // Base Condition
        if (i > j)
            return 0;
        if (i == j) {
            if (isTrue == 1)
                return s.charAt(i) == 'T' ? 1 : 0;
            else
                return s.charAt(i) == 'F' ? 1 : 0;
        }

        if (dp[i][j][isTrue] != -1)
            return dp[i][j][isTrue] % 1003;

        int ans = 0;
        for (int k = i + 1; k <= j - 1; k = k + 2) {
            int leftF, leftT, rightT, rightF;

            leftT = dp[i][k - 1][1] == -1 ? solve(s, i, k - 1, 1) % 1003 : dp[i][k - 1][1] % 1003;
            rightT = dp[k + 1][j][1] == -1 ? solve(s, k + 1, j, 1) % 1003 : dp[k + 1][j][1] % 1003;

            leftF = dp[i][k - 1][0] == -1 ? solve(s, i, k - 1, 0) % 1003 : dp[i][k - 1][0] % 1003;
            rightF = dp[k + 1][j][0] == -1 ? solve(s, k + 1, j, 0) % 1003 : dp[k + 1][j][0] % 1003;

            if (s.charAt(k) == '&') {
                if (isTrue == 1)
                    ans += (leftT * rightT) % 1003;
                else
                    ans += (leftF * rightF + leftT * rightF + leftF * rightT) % 1003;

                ans %= 1003;
            } else if (s.charAt(k) == '|') {
                if (isTrue == 1)
                    ans += (leftT * rightT + leftT * rightF + leftF * rightT) % 1003;
                else
                    ans += (leftF * rightF) % 1003;

                ans %= 1003;
            } else if (s.charAt(k) == '^') {
                if (isTrue == 1)
                    ans += (leftF * rightT + leftT * rightF) % 1003;
                else
                    ans += (leftT * rightT + leftF * rightF) % 1003;

                ans %= 1003;
            }
            dp[i][j][isTrue] = ans % 1003;
        }
        return ans % 1003;
    }

    static int countWays(int n, String s) {
        dp = new int[n][n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return solve(s, 0, n - 1, 1);
    }
}