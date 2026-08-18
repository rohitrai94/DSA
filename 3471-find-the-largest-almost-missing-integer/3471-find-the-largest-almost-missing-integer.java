class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(n == 1) return nums[0];        
        if(n == k){
            int max = -1;
            for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);
            }
            return max;
        }
        int arr[] = new int[51];
        for(int i=0; i<n; i++){
            arr[nums[i]]++;
        }

        if(k == 1){
            for(int i= 50; i>0; i--){
                if(arr[i] == 1) return i;
            }
            return -1;
        }
        int st= nums[0];
        int end = nums[n-1];
        int res = -1;
        if(arr[st] == 1){
            res = Math.max(res,st);
        }
        if(arr[end] == 1){
            res = Math.max(res,end);
        }
        return res;
    }
}