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
    public void flatten(TreeNode root) {
        flat(root);
    }
    public TreeNode flat(TreeNode root){
        if(root==null)return root;
        TreeNode l1=flat(root.left);
        TreeNode l2=flat(root.right);
        root.left=null;
        root.right=l1;
        TreeNode temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        temp.right=l2;
        return root;
    }
}