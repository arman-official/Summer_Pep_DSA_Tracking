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
    public int maxPathSum(TreeNode root) {
        int[] maxi=new int[]{Integer.MIN_VALUE};
        return Math.max(fun(root,maxi),maxi[0]);
    }
    int fun(TreeNode root,int[] maxi){
        if(root==null)return 0;
        int ls=Math.max(0,fun(root.left,maxi));
        int rs=Math.max(0,fun(root.right,maxi));
        maxi[0]=Math.max(maxi[0],root.val+ls+rs);
        return root.val+Math.max(ls,rs);
    }
    
}