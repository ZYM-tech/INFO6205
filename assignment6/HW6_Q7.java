public class HW6_Q7 {
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
    public void flatten(TreeNode root) {
        helper(root);
    }
    private TreeNode helper(TreeNode node){
        if(node == null) return null;
        if(node.left == null && node.right == null){
            return node;
        }
        TreeNode leftTail = helper(node.left);
        TreeNode rightTail = helper(node.right);

        if(leftTail != null){
            leftTail.right = node.right;
            node.right = node.left;
            node.left = null;
        }
        if(rightTail == null) return leftTail;
        else return rightTail;
    }
}
