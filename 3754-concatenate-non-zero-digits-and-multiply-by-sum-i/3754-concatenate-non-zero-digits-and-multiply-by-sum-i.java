class Solution {
    public long sumAndMultiply(int n) {
        long sum =0;
        int x = 0;
        while(n > 0){
            int temp = n%10;
            if(temp != 0){
                x = x*10+temp;
                sum += temp;
            }
            n /= 10;
        }
        int rev = 0;
        while(x > 0){
            rev = rev*10+(x%10);
            x /= 10; 
        }
        return sum*rev;
    }
}