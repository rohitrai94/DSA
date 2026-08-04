class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int min= 101;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        for(int i = min; i<max; i++ ){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}