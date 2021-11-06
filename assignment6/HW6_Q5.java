public class HW6_Q5 {
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        if(isSameTree(root,subRoot)) return true;
        //注意是"或"
        return isSubtree(root.left,subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean isSameTree(TreeNode s, TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;

        if(s.val != t.val) return false;
        //注意是"且"
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
