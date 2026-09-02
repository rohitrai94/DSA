class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list  = new ArrayList<>();
        for(int num : nums1){
            set.add(num);
        }
        for(int num : nums2){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
           
        }
        return list.stream()
                          .mapToInt(Integer::intValue)
                          .toArray();
    }
}