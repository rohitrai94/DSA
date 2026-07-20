class Solution {
    public int fib(int n) {
        if(n < 2) return n;
        int ans =1;
        int i = 0;
        int j=1;
        for(int k=2; k<=n; k++){
            ans = i+j;
            i = j;
            j= ans;
        }
        return ans;
    }
}