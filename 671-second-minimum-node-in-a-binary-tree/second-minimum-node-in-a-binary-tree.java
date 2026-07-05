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
/*
imorder process panni duplicate illama list la store panniten
next 2 nd element return 
*/ 
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        Set<Integer> st=new HashSet<>();
        List<Integer> rs=new ArrayList<>();
        inoder_help(root,ls);
        for(int i:ls){
            if(st.add(i)) rs.add(i);
        }
        // System.out.println(rs);
        Collections.sort(rs);
        if(rs.size()<2) return -1;
        return rs.get(1);
    }
    void inoder_help(TreeNode root,List<Integer> ls){
        if(root==null) return ;
        inoder_help(root.left,ls);
         ls.add(root.val);
        inoder_help(root.right,ls);
    }
}