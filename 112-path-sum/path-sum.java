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
    int path=0;
    boolean k=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null ) return false;
        if(root.left==null && root.right==null && targetSum==root.val) return true;
        //path+=root.val;
        PathSum(root,targetSum);

        return k;
    }
    void PathSum(TreeNode root,int t){
        if(root==null){
            return;
        } 
        path+=root.val;

        if(root.left==null && root.right==null) {
            if(path==t) {
                k=true;
                return;
            }
        }
        PathSum(root.left,t);
        PathSum(root.right,t);
        path-=root.val;
    }
}