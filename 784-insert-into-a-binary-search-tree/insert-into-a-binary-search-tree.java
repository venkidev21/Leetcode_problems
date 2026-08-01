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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp=root;
        TreeNode n=new TreeNode(val);
        if(root==null) {
            return n;
            
        }
        while(temp.left!=null || temp.right!=null){
            if(temp.val>val && temp.left!=null) temp=temp.left;
            else  if(temp.val<val && temp.right!=null ) temp=temp.right;
            else break;
        }
        if(val>temp.val){
            temp.right=n;
        }
        else temp.left=n;
        return root;
        
        
        
    }
}