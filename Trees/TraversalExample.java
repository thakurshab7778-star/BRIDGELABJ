import java.util.*;

class Node {
    String name;
    Node left, right;

    Node(String name) {
        this.name = name;
    }
}

public class TraversalExample {

    static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.name + " ");
        preorder(root.left);
        preorder(root.right);
    }

   
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.name + " ");
        inorder(root.right);
    }

   
    static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.name + " ");
    }

    public static void main(String[] args) {

        
        Node root = new Node("root");
        root.left = new Node("home");
        root.right = new Node("var");

        root.left.left = new Node("user");
        root.left.right = new Node("docs");

        root.right.right = new Node("log");

        root.left.left.left = new Node("config");

        System.out.print("Preorder: ");
        preorder(root);

        System.out.print("\nInorder: ");
        inorder(root);

        System.out.print("\nPostorder: ");
        postorder(root);
    }
}