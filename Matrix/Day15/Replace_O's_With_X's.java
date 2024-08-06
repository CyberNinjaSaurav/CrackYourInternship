package CrackYourInternship.Matrix.Day15;

public class Replace_O's_With_X's {


    static char[][] fill(int n, int m, char a[][])
    {
       boolean[][] vis = new boolean[n][m];
        for(int j=0;j<m;j++){
            if(a[0][j] == 'O'){
                dfs(0,j,a,vis);
            }
            if(a[n-1][j] == 'O'){
                dfs(n-1,j,a,vis);
            }
        }
        for(int i=0;i<n;i++){
            if(a[i][0] == 'O'){
                dfs(i,0,a,vis);
            }
            if(a[i][m-1] == 'O'){
                dfs(i,m-1,a,vis);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j] == 'O' && !vis[i][j]){
                    a[i][j] = 'X';
                }
            }
        }
        return a;
    }
    
    static void dfs(int i,int j,char[][] a,boolean[][] vis){
        vis[i][j] = true;
        int n = a.length;
        int m = a[0].length;
            if(i+1 < n && a[i+1][j] == 'O' && !vis[i+1][j] ){
                dfs(i+1,j,a,vis); 
            }
            if(i-1 >= 0 && a[i-1][j] == 'O' && !vis[i-1][j]){
                dfs(i-1,j,a,vis); 
            }
            if(j+1 < m && a[i][j+1] == 'O' && !vis[i][j+1]){
                dfs(i,j+1,a,vis);
            }
            if(j-1 >= 0 && a[i][j-1] == 'O' && !vis[i][j-1]){
                dfs(i,j-1,a,vis); 
            }
    }
}

