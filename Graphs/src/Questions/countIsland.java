package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countIsland {
 
	public static int findIsland(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              vis[i][j]=0;
          }
        }
        int count=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(vis[i][j]==0 )
                    if(grid[i][j]=='1'){
                       count++;
                       dfs(i,j,vis,grid);
                       
                }
            }
        }
        return count;
    } 
    public static void dfs(int i,int j,int[][] vis,char[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length)
          return;
        if(grid[i][j]=='0')
          return;
        if(vis[i][j]==0){
            vis[i][j]=1;
            dfs(i+1,j,vis,grid);
            dfs(i,j+1,vis,grid);
            dfs(i-1,j,vis,grid);
            dfs(i,j-1,vis,grid);
            dfs(i+1,j+1,vis,grid);
            dfs(i-1,j-1,vis,grid);
            dfs(i+1,j-1,vis,grid);
            dfs(i-1,j+1,vis,grid);
        }
    }
    
public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];

       for (int i = 0; i < n; i++) {
        String[] S = br.readLine().trim().split(" ");
        for (int j = 0; j < m; j++) {
            grid[i][j] = S[j].charAt(0);
        }
      }
       
       int ans = findIsland(grid);
       System.out.println(ans);
   }
  }
}
