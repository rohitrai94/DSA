class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            int[] row = new int[10];
            for(int j=0; j<9; j++){
                char c = board[i][j];
                if(c == '.') continue;
                int idx = c-'0';
                if(row[idx] > 0){
                    return false;
                }
                row[idx]++;
            }
        }

         for(int i=0; i<9; i++){
            int[] col = new int[10];
            for(int j=0; j<9; j++){
                char c = board[j][i];
                if(c == '.') continue;
                int idx = c-'0';
                if(col[idx] > 0){
                    return false;
                }
                col[idx]++;
            }
        }

         for(int i=0; i<9; i++){
            int[] grid = new int[10];
            int t = i/3;
            for(int j=0; j<9; j++){
                int row = j/3 +t*3;
                int col = j%3 +(i%3)*3;

                char c = board[row][col];
                if(c == '.') continue;
                int idx = c-'0';
                if(grid[idx] > 0){
                    return false;
                }
                grid[idx]++;
            
            }
        }

        return true;
    }
}