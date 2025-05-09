class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            
            int target = -(nums[i]);
            int a = i+1;
            int b = n-1;
            while(a<b){
                int total = nums[a]+nums[b];
                if(total > target){
                    b--;
                }else if(total < target){
                    a++;
                }else{
                   res.add(Arrays.asList(nums[i], nums[a], nums[b]));
                   while(a<b && nums[a]==nums[a+1]){
                    a++;
                }
                while(a<b && nums[b]==nums[b-1]){
                    b--;
                }
                a++;
                b--;
                }
                
            }
        }
        return res;
    }
}
