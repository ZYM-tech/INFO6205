import java.util.ArrayList;

public class HW6_Q2 {
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        returnTreeLeaves(root1, arr1);
        returnTreeLeaves(root2, arr2);

        return arr1.equals(arr2);


    }
    private void returnTreeLeaves(TreeNode node, ArrayList<Integer> arr){
        if(node == null) return;
        if(node.left==null && node.right == null){
            arr.add(node.val);
        }
        returnTreeLeaves(node.left, arr);
        returnTreeLeaves(node.right, arr);
    }
}
