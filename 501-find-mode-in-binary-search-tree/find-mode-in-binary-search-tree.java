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
    Map<Integer,Integer> mp=new HashMap<>();
    
    public int[] findMode(TreeNode root) {
        Dfs(root);
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        pq.addAll(mp.entrySet());
        int t=pq.peek().getValue();
        List<Integer> ls=new ArrayList<>();

        while(!pq.isEmpty() && pq.peek().getValue()==t){
            ls.add(pq.poll().getKey());
        }
        return ls.stream().mapToInt(Integer::intValue).toArray();
    }

    void Dfs(TreeNode root){
        if(root==null) return ;

        mp.put(root.val,mp.getOrDefault(root.val,0)+1);
        Dfs(root.left);
        Dfs(root.right);
    }
}