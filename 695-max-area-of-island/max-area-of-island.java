class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        int m=grid.length;
        int n=grid[0].length;
        int[][] vis=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    int temp= fun(grid,vis,i,j);
                    System.out.println(temp+"->"+i+" "+j);
                    max=Math.max(max,temp);
                }
            }
        }
        return max;
    }public int fun(int[][] grid,int[][] vis,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        vis[i][j]=1;
        int[] dx=new int[]{0,0,-1,1};
        int[] dy=new int[]{1,-1,0,0};
            int area=1;
        for(int k=0;k<4;k++){
            int ndx=i+dx[k];
            int ndy=j+dy[k];
            if(ndx>=0 && ndx<m && ndy>=0 && ndy<n && vis[ndx][ndy]==0 && grid[ndx][ndy]==1){
                 area+=fun(grid,vis,ndx,ndy);
            }
        }return area;

    }
}