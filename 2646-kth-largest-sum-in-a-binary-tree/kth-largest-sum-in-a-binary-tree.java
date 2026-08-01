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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null) return 0;
        List<Long> ls=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            long sum=0;
            for(int i=0;i<s;i++){
            TreeNode curr=q.poll();
                sum+=curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            ls.add(sum);

        }
        Collections.sort(ls);
        if(ls.size()<k) return -1;
        return ls.get(ls.size()-k);


    }
}