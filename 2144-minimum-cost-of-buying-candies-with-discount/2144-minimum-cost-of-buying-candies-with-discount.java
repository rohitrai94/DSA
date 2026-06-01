class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0;
        for(int i=cost.length-1; i>=0; i--){
            if((cost.length-1-i)%3 != 2){
                res += cost[i];
            }
        }
        return res;
    }
}