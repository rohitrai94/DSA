class Solution {
    public int maxProduct(int n) {
        int arr[] = new int[10];
        while(n > 0){
            int dig = n%10;
            arr[dig]++;
            n /=10;
        }

        int first = -1;

        for(int i = 9; i>=0; i--){
            if(arr[i] > 0){

                if(first != -1){
                    return first*i;
                }
                if(arr[i] >= 2){
                    return i*i;
                }
                first =i;
            }
        }
        return 0;
    }
}