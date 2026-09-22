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
    List<List<Integer>> AllPath=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> Path=new ArrayList<>();
        Path.add(root.val);

        List<String> result=new ArrayList<>();
         dfs(root,Path);
        for(List<Integer> lst:AllPath){
            String s=""+lst.get(0);
            for(int i=1;i<lst.size();i++){
                s+="->"+lst.get(i);
            }
            result.add(s);
        }
       
        return result;
    }

    void dfs(TreeNode root,List<Integer> path){
        if(root.left==null && root.right==null){
            AllPath.add(new ArrayList<>(path));
            return;
        }
        if(root.left!=null){
        path.add(root.left.val);
        dfs( root.left,path);
        path.remove(path.size()-1);
        }

        if(root.right!=null){
         
        path.add(root.right.val);
        dfs( root.right,path);
        path.remove(path.size()-1);
        

        }



    }
}