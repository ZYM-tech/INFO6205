class Node {
    int data;
    Node left;
    Node right;
    Node(int s){
        data = s;
        right = null;
        left = null;
    }
}

public class Foldable {
    Node root;

    public boolean isFoldable(Node node) {
        boolean result;
        if (node == null)
            return true;

        mirror(node.left);
        result = isSameStru(node.left, node.right);

        mirror(node.left);
        return result;
    }

    public boolean isSameStru(Node a, Node b){
        if (a == null && b == null)
            return true;
        if (a != null&& b != null &&isSameStru(a.left, b.left) && isSameStru(a.right, b.right)){
            return true;
        }
        return false;
    }

    public void mirror(Node node){
        if (node == null)
            return;
        else {
            mirror(node.left);
            mirror(node.right);

            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }

    public static void main (String[] args){

        Foldable t = new Foldable();
        t.root =new Node(1);
        t.root.right = new Node(3);
        t.root.left = new Node(2);
        t.root.left.right = new Node(5);
        t.root.right.left = new Node(4);

        System.out.println(t.isFoldable(t.root));
    }
}