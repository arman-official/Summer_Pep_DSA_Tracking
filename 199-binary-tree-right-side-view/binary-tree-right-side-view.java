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
 class pair{
    TreeNode root;
    int level;
    pair(TreeNode root,int level){
        this.root=root;
        this.level=level;
    }
 }
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        TreeMap<Integer,Integer> m=new TreeMap<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        while(!q.isEmpty()){
            pair p=q.poll();
            if(!m.containsKey(p.level))m.put(p.level,p.root.val);
            if(p.root.right!=null)q.add(new pair(p.root.right,p.level+1));
            if(p.root.left!=null)q.add(new pair(p.root.left,p.level+1));
        }
        for(int i:m.values())ans.add(i);
        return ans;
    }
}