class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int topView = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j<m; j++){
               if(grid[i][j] > 0){
                topView++;
               }
            }
        }

        int frontView = 0;
        for(int i=0; i < n; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<m; j++){
                max = Math.max(max,grid[i][j]);
            }
            frontView += max;
        }

        int sideView = 0;
        for(int i=0; i < m; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<n; j++){
                max = Math.max(max,grid[j][i]);
            }
            sideView += max;
        }

    return topView + frontView + sideView;
    }
}