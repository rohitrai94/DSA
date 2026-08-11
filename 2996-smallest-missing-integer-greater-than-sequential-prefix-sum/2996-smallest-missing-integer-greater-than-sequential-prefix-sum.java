class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int j = 1;
        int sum = nums[0];
        Set<Integer> set = new HashSet<>();
        while(j < n && nums[j] == nums[j-1]+1){
            sum += nums[j];
            j++;
        }

        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }

        while(set.contains(sum)){
            sum += 1;
        }

        return sum;
    }
}