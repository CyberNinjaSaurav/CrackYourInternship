package CrackYourInternship.Matrix.Day15;

public class Number_Of_Islands {

    public int numIslands(char[][] grid) {
        // Code here
        
        int n = grid.length;
        int m = grid[0].length;
        
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
       private void dfs(char[][] grid, int i, int j){
             if(i<0||i>=grid.length||j<0 ||j>=grid[0].length || grid[i][j]=='0'){
               return;
           }
           
           grid[i][j] = '0';
           for(int n = -1; n <= 1; n++){
               for(int m = -1; m <= 1; m++){
                   
                   int delrow = i + n;
                   int delcol = j + m;
                   dfs(grid, delrow, delcol);
               
               }
           }
       }
}
    
