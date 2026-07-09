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
    public boolean hasPathSum(TreeNode root, int t) {
        if(root==null)return false;
        return fun(root,t);
    }
    boolean fun(TreeNode root,int t){
        t-=root.val;
        if(root.left==null && root.right==null){
            if(t==0)return true;
            return false;
        }
        if(root.left==null)return fun(root.right,t);
        if(root.right==null)return fun(root.left,t);
        return fun(root.right,t)||fun(root.left,t);
    }
}