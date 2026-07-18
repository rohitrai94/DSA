class Solution {
    public int findGCD(int[] nums) {
        int min = 1001;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        for(int i = min; i>0; i--){
            if((max%i == 0) && (min %i == 0)){
                return i;
            }
        }
        return 1;
    }
}