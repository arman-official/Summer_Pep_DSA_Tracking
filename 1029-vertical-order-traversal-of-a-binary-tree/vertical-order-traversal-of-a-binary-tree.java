/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class tuple{
    TreeNode root;
    int x;
    int y;
    tuple(TreeNode root,int x,int y){
        this.root=root;
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> m=new TreeMap<>();
        Queue<tuple> q=new LinkedList<>();
        q.add(new tuple(root,0,0));
        while(!q.isEmpty()){
            tuple t=q.poll();
            if(!m.containsKey(t.x))m.put(t.x,new TreeMap<>());
            if(!m.get(t.x).containsKey(t.y))m.get(t.x).put(t.y,new PriorityQueue<>());
            m.get(t.x).get(t.y).add(t.root.val);

            if(t.root.left!=null)q.add(new tuple(t.root.left,t.x-1,t.y+1));
            if(t.root.right!=null)q.add(new tuple(t.root.right,t.x+1,t.y+1));
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> i:m.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> j:i.values()){
                while(!j.isEmpty()){
                    ans.get(ans.size()-1).add(j.poll());
                }
            }
        }
        return ans;
    }
}