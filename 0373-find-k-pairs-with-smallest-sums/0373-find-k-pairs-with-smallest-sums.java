// class Solution {
//     public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//         PriorityQueue<int[]> p = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
//         List<List<Integer>> res = new ArrayList<>();
//         for(int i=0; i<Math.min(nums1.length, k); i++){
//             p.add(new int[]{nums1[i], nums2[0], 0});
//         }
//         while(k-- > 0 && !p.isEmpty()){
//             int[] curr = p.poll();
//             res.add(Arrays.asList(curr[0], curr[1]));
//             int idx = curr[2];
//             if(idx+1 < nums2.length){
//                 p.add(new int[]{curr[0], nums2[idx+1], idx+1});
//             }
//         }
//     return res;
//     }
// }


class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> p = new PriorityQueue<>((a, b) -> (a[0] + a[1]) - (b[0] + b[1]));
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<Math.min(nums1.length,k); i++){
            p.add(new int[]{nums1[i], nums2[0],0});
        }

        while(k-- > 0 && !p.isEmpty()){
            int curr[] = p.poll();
            list.add(Arrays.asList(curr[0], curr[1]));
            int idx = curr[2];
            if(idx+1 < nums2.length){
                p.add(new int[]{
                curr[0],
                nums2[idx+1],
                idx+1
            });
        }
        }
        

        return list;
    }
}