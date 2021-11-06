import java.util.Stack;

public class HW6_Q3 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
    //Time: O(n) Space: O(n)
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> subsum = new Stack<>();

        path.push(root);
        subsum.push(root.val);

        while(!path.isEmpty()){
            TreeNode node = path.pop();
            int sub = subsum.pop();

            if(node.left==null&&node.right==null&&sub==targetSum){
                return true;
            }
            if(node.left!=null){
                path.push(node.left);
                subsum.push(sub+node.left.val);
            }
            if(node.right!=null){
                path.push(node.right);
                subsum.push(sub+node.right.val);
            }
        }
        return false;
    }
}
