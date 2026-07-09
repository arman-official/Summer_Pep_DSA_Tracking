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
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        if(root==null)return ll;
        fun(ll,l,root,t);
        return ll;
    }void fun(List<List<Integer>> ll,List<Integer> l,TreeNode root, int t){
        t-=root.val;
        l.add(root.val);
        if(root.left==null && root.right==null){
            if(t==0){
                ll.add(new ArrayList<>(l));
            }
                t+=root.val;
                l.remove(l.size()-1);
            return;
        }
        if(root.left!=null){
            fun(ll,l,root.left,t);
        }
        if(root.right!=null){
            fun(ll,l,root.right,t);
        }
        t+=root.val;
        l.remove(l.size()-1);
    }
}