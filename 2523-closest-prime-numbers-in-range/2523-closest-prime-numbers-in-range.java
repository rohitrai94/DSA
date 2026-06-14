class Solution {
    public int[] closestPrimes(int left, int right) {
        int arr[] = new int[2];
        if(right <= 2){
            return new int[]{-1,-1};
        }

        boolean[] isPrime = new boolean[right+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i*i<=right; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=right; j += i){
                    isPrime[j]= false;
                }
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i=left; i<=right; i++){
            if(isPrime[i]){
                list.add(i);
            }
        }

        if(list.size() <= 1) return new int[]{-1,-1};
        int min = right+1;
        for(int i=0; i<list.size()-1; i++){
            int diff = list.get(i+1) - list.get(i);
            if(min > diff){
                arr[0] = list.get(i);
                arr[1] = list.get(i+1);
            }
            min = Math.min(min, diff);
        }
        return arr;
    }
}