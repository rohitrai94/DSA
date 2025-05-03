class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        long sum = (long)N * (N + 1) / 2;
        long sqsum = (long)N * (N + 1) * (2 * N + 1) / 6;

        long gridsum = 0, gridsqsum = 0;
        for (int[] row : grid) {
            for (int num : row) {
                gridsum += num;
                gridsqsum += (long)num * num;
            }
        }

        long S = gridsum - sum;
        long P = gridsqsum - sqsum;

        long a_plus_b = P / S;
        long a = (S + a_plus_b) / 2;
        long b = a - S;

        return new int[]{(int)a, (int)b};
    }
}
