class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int topView = 0;
        int frontView = 0;
        int sideView = 0;
        for(int i=0; i < n; i++){
            int rowMax = 0;
            int collMax = 0;
            for(int j=0; j<m; j++){
               if(grid[i][j] > 0){
                topView++;
               }
                rowMax = Math.max(rowMax,grid[i][j]);
                collMax = Math.max(collMax, grid[j][i]);
            }
            frontView += rowMax;
            sideView += collMax;
        }

    return topView + frontView + sideView;
    }
}