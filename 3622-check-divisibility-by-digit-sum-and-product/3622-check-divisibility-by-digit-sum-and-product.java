class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int pro = 1;
        int num = n;
        while(n > 0){
            int t = n%10;
            sum += t;
            pro *= t;
            n /= 10;
        }

        if(num %(sum+pro) == 0){
            return true;
        }

        return false;
    }
}