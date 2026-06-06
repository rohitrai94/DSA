class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int res[] = new int[n];
        int leftsum = 0;
        int rightsum = 0;
        for(int i=0; i<n; i++){
             res[i] = leftsum;
             leftsum += nums[i];
        }

        for(int i=n-1; i>=0; i--){
            res[i] = Math.abs(res[i]-rightsum);
            rightsum += nums[i];
        }
        return res;
    }
}