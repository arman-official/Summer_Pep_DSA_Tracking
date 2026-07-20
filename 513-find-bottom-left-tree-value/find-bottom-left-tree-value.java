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
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int[] val=new int[]{-1};
        int[] maxDepth=new int[]{0};
        int[] currDepth=new int[]{0};
        dfs(root,maxDepth,val,currDepth);
        return val[0];
    }public void dfs(TreeNode root,int[] maxDepth,int[] val,int[] currDep){
        if(root==null)return ;
        // System.out.println(currDep+" "+root.val);
        currDep[0]++;
        if(currDep[0]>maxDepth[0]){
            maxDepth[0]=currDep[0];
            val[0]=root.val;
        }
        dfs(root.left,maxDepth,val,currDep);
        dfs(root.right,maxDepth,val,currDep);
        currDep[0]--;
    }
}