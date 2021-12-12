import java.util.*;

public class levelOrder{

    public static void main(String[] args){
        int num[] = {1,2,3,4,5,6};
        int n = num.length;
        Node testroot = createTree(n, num);

    }


    static class Node{

        Node left;
        Node right;
        int data;
    }
    static Queue<Node> queue = new LinkedList<>();
    static Node root = null;

    public static Node nodenew(int key) {
        Node t = new Node();
        t.data = key;
        t.left = null;
        t.right = null;
        return t;
    }
    public static Node createTree(int n, int num[]){
        for (int i = 0; i< n; i++){
             levelOrderInsert(num[i]);
        }
        return root;
    }

    public static void levelOrderInsert(int data)  {
        Node node = nodenew(data);

        if (root ==null)
            root = node;

        else if (queue.peek().left==  null){
            queue.peek().left = node;
        }


        else {
            queue.peek().right =node;
            queue.remove();
        }
        queue.add(node);
    }
}