class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count =0;
        int max = 0;
        for(int i=0; i<costs.length; i++){
            max = Math.max(max, costs[i]);
        }
        int arr[] = new int[max+1]; 
        for(int i=0; i<costs.length; i++){
            arr[costs[i]]++;
        }

        for(int i=1; i<=max; i++){
           if(arr[i] == 0) continue;
           int canBuy = Math.min(arr[i], coins/i);

           count += canBuy;
           coins -= canBuy*i;

           if(coins < i) continue;
        }
        return count;
    }
}