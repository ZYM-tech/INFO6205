import javax.swing.tree.TreeNode;
import java.util.*;

public class Midterm_Q4 {

    public static class TreeNode {
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

    //Here is Question 4
    public static void printTree(TreeNode root){
        List<List<Integer>> levels = new ArrayList<>();
        levels  = Midterm_Q4.levelOrder(root);
        int size = levels.size();
        int count = 1;
        //each level
        for(int i=0; i<size;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int s=0;s<count;s++){
                arr.add(levels.get(i).get(s));
                //System.out.println(levels.get(i).get(s)+' ');
            }

            System.out.println(Arrays.toString(arr.toArray()));
            count++;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        ArrayList<List<Integer>> levels = new ArrayList<List<Integer>>();
        if(root == null){
            return levels;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int queue_length = queue.size();
            for(int i=0;i<queue_length;i++){
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            levels.add(list);
        }
        return levels;
    }
}
