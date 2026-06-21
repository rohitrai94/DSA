class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count =0;
        int sum = 0;
        Arrays.sort(costs);
        for(int i=0; i<costs.length; i++){
            if(sum+costs[i] <= coins){
                count++;
                sum += costs[i];
            }
        }
        return count;
    }
}