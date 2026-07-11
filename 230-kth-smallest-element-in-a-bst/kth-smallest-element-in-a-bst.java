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
    public int kthSmallest(TreeNode root, int k) {
        int c= cnt(root.left);
        if(c==k-1)return root.val;
        if(c<k-1){
            k=k-c-1;
            return kthSmallest(root.right,k);
        }else{
            return kthSmallest(root.left,k);
        }

    }
    public int cnt(TreeNode root){
        if(root==null)return 0;
        return 1+cnt(root.left)+cnt(root.right);
    }
}