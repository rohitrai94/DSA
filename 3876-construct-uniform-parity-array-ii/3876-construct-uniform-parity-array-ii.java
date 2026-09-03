class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int min = nums1[0];
        boolean isOdd = false;
        for(int num : nums1){
           if(num < min){
            min = num;
           }
           if((num & 1) == 1){
            isOdd = true;
           }
        }

        if((min & 1 )== 1){
            return true;
        }
       
       return !isOdd;
    }
}