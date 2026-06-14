class Solution {
    public int[] closestPrimes(int left, int right) {
        int arr[] = { -1, -1 };
        if (right <= 2) {
            return arr;
        }

        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int prev = -1;
        int min = right + 1;
        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                if (prev != -1) {
                    int diff = i - prev;
                    if (min > diff) {
                        min = diff;
                        arr[0] = prev;
                        arr[1] = i;
                    }
                }
                prev = i;
            }

        }
        return arr;
    }
}