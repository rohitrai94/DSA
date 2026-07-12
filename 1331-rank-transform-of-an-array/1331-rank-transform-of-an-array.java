class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int sortArr[] = Arrays.copyOf(arr, n);
        Arrays.sort(sortArr);
        int rank =1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
          if(i>0 && sortArr[i] > sortArr[i-1]){
            rank++;
          }
          map.put(sortArr[i],rank);
        }
        
        for(int i =0; i<n; i++){
            arr[i] = map.get(arr[i]);
        }
    return arr;
    }
}