class Solution {
    public int maxProduct(int n) {
        int first =0;
        int sec= 0;
        while(n > 0){
            int dig = n%10;
            if(dig > first){
                sec = first;
                first = dig;
            }else if( dig > sec){
                sec = dig;
            }
            n /= 10;
        }

        return first*sec;
    }
}