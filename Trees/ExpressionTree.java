import java.util.*;

class Node {
    String value;
    Node left, right;

    Node(String value) {
        this.value = value;
        left = right = null;
    }
}

public class ExpressionTree {

    static void inorder(Node root) {
        if (root == null) return;

        if (root.left != null) System.out.print("(");
        inorder(root.left);

        System.out.print(root.value);

        inorder(root.right);
        if (root.right != null) System.out.print(")");
    }
    static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    static int evaluate(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null)
            return Integer.parseInt(root.value);

        int left = evaluate(root.left);
        int right = evaluate(root.right);

        switch (root.value) {
            case "+": return left + right;
            case "-": return left - right;
            case "*": return left * right;
            case "/": return left / right;
        }
        return 0;
    }

    public static void main(String[] args) {

        Node root = new Node("*");

        root.left = new Node("+");
        root.right = new Node("-");

        root.left.left = new Node("3");
        root.left.right = new Node("5");

        root.right.left = new Node("8");
        root.right.right = new Node("2");

        System.out.print("Inorder (Infix): ");
        inorder(root);

        System.out.print("\nPreorder (Prefix): ");
        preorder(root);

        System.out.print("\nPostorder (Postfix): ");
        postorder(root);

        int result = evaluate(root);
        System.out.println("\nResult: " + result);
    }
}