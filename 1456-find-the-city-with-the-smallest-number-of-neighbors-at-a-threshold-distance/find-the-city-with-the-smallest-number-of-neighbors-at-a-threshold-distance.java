class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] adj=new int[n][n];
        for(int[] i:adj)Arrays.fill(i,(int)1e9);
        for(int[] i:edges){
            int u=i[0];
            int v=i[1];
            int d=i[2];
            adj[u][v]=d;
            adj[v][u]=d;
        }
        for(int i=0;i<n;i++)adj[i][i]=0;
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(adj[i][k] < 1e9 && adj[k][j]<1e9){
                        adj[i][j]=Math.min(adj[i][j],adj[i][k]+adj[k][j]);
                    }
                }
            }
        }
        int ans=0;
        int cnt=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int tempcnt=0;
            for(int j:adj[i]){
                if(j<=distanceThreshold)tempcnt++;
            }
            if(tempcnt<=cnt){
                ans=i;
                cnt=tempcnt;
            }
        }
        return ans;
    }
}