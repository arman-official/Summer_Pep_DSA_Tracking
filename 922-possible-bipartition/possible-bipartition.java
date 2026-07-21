class Solution {
    public boolean possibleBipartition(int V, int[][] edges) {
       int[] vis=new int[V];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0]-1;
            int v=edges[i][1]-1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Arrays.fill(vis,-1);
        for(int i=0;i<V;i++){
            if(vis[i]==-1){

                boolean res= dfs(adj,i,vis,0);
                if(!res)return false;
            }
        }
        // for(int i=0;i<V;i++)System.out.println(vis[i]);
        return true;
    }public boolean dfs(List<List<Integer>> adj,int v,int[] vis,int paint){
        vis[v]=paint;
        for(int nbr:adj.get(v)){
            if(vis[nbr]==-1){
                paint= vis[v]==0?1:0;
                if(!dfs(adj,nbr,vis,paint))return false;
            }else{
                if(vis[v]==vis[nbr])return false;
            }
        }
        return true;
    } 
    }
