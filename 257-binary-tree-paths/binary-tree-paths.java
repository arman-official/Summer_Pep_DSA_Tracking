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
    public List<String> binaryTreePaths(TreeNode root) {
        List<List<Integer>> ll=new ArrayList<>();
        List<Integer> l=new ArrayList<>();

        fun(ll,l,root);
        return fun2(ll);
    }
    void fun(List<List<Integer>> ll,List<Integer> l,TreeNode root){
        if(root==null)return;
        l.add(root.val);
        if(root.left==null && root.right==null){
            ll.add(new ArrayList<>(l));
        }
        fun(ll,l,root.left);
        fun(ll,l,root.right);
        l.remove(l.size()-1);
    }
    List<String> fun2(List<List<Integer>> ll){
        List<String> ans=new ArrayList<>();
        for(List<Integer> l:ll){
            String s="";
            for(int i=0;i<l.size();i++){
                s+=Integer.toString(l.get(i));
                if(i!=l.size()-1)s+="->";
            }
            ans.add(s);
        }
        return ans;
    }
}