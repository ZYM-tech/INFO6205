public class HW6_Q4 {
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
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        maxdepth(root);
        return result;
    }

    private int maxdepth(TreeNode node){
        if(node == null)
            return 0;

        int l = maxdepth(node.left);
        int r = maxdepth(node.right);
        if(Math.abs(l - r)>1){
            result = false;
        }
        return  1+ Math.max(l , r);
    }
}
