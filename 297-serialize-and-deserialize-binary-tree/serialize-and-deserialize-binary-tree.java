/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    
    public String serialize(TreeNode root) {
       if(root==null) return "null";
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      String rs="";
      while(!q.isEmpty()){
        TreeNode temp=q.poll();
        if(temp==null) {
            rs+="null,";
            continue;
        }
        else rs+=temp.val+",";

            q.add(temp.left);
            q.add(temp.right);
      }
    //   System.out.println(rs);
      return rs;
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty() || data.equals("null")  ) return null;
        String arr[]=data.split(",");
        
        Queue<TreeNode> q=new LinkedList<>();
        
        TreeNode root=new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        int i=1;
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(i<arr.length && !arr[i].equals("null")){
                 TreeNode left=new TreeNode(Integer.valueOf(arr[i]));
                 temp.left=left;
                 q.add(temp.left);
            }
            i++;
            if(i<arr.length && !arr[i].equals("null")){
                 TreeNode right=new TreeNode(Integer.valueOf(arr[i]));
                 temp.right=right;
                 q.add(temp.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));