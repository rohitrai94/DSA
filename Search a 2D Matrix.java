class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0,  right=matrix.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(matrix[mid][0] > target){
                right = mid-1;
            }else{
                int st=0, end= matrix[0].length-1;
                while(st<=end){
                    int mid1= st + (end-st)/2;
                    if(matrix[mid][mid1] == target){
                        return true;
                    }
                    if(matrix[mid][mid1] > target){
                        end = mid1-1;
                    }else{
                        st = mid1+1;
                    }
                }
                left = mid+1;
            }
        }
        return false;
    }
}
