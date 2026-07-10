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
    int x;
    int y;
    pair(int x,int y){
        this.x=x;
        this.y=y;
    }
 }

class Solution {
    public List<TreeNode> allPossible(int start,int end,Map<pair,List<TreeNode>> memo){
        List<TreeNode> res=new ArrayList<>();

        if(start>end){
            res.add(null);
            return res;
        }

        if(memo.containsKey(new pair(start,end))){
            return memo.get(new pair(start,end));
        }

        for(int i=start;i<=end;i++){
            List<TreeNode> leftSubtrees= allPossible(start,i-1,memo);
            List<TreeNode> rightSubtrees= allPossible(i+1,end,memo);
            for(TreeNode left:leftSubtrees){
                for(TreeNode right:rightSubtrees){
                    TreeNode temp=new TreeNode(i,left,right);
                    res.add(temp);
                }
            }
        }
        memo.put(new pair(start,end),res);

        return res;
    }
    public List<TreeNode> generateTrees(int n) {
        Map<pair,List<TreeNode>> memo=new HashMap<>();
        return allPossible(1,n,memo);
    }
}