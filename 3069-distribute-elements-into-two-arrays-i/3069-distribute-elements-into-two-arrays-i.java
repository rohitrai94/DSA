class Solution {
    public int[] resultArray(int[] nums) {
        int n =nums.length;
        int res[] = new int[n];
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        arr1[0]= nums[0];
        arr2[0]= nums[1]; 
        int i = 1;
        int j = 1;
        for(int idx=2; idx<n; idx++){
            if(arr1[i-1] > arr2[j-1]){
              arr1[i] = nums[idx];
                i++;
            }else{
                arr2[j] = nums[idx];
                j++;
            }   
        }
        int k=0;
        for(int idx=0; idx<arr1.length; idx++ ){
            if(arr1[idx] == 0) break;
            res[k++] = arr1[idx];
        }
        for(int idx=0; idx<arr2.length; idx++ ){
            if(arr2[idx] == 0) break;
            res[k++] = arr2[idx];
        }

         return res;
    }
}