class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<n; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }  

        List<Integer>[] bucket = new List[n+1];
        for(int num : freq.keySet()){
            int count = freq.get(num);
            if(bucket[count] == null){
                bucket[count] = new ArrayList<>();
            } 
            bucket[count].add(num);
        }

        int res[] = new int[k];
        int idx =0;
        for(int i=n; i>0 && idx <k; i--){
            
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    res[idx++] = num;
                    if(idx == k) break;
                }
            }
        } 
        return res;
    }
}