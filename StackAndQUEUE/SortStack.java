import java.util.*;

class SortStack {

    static void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int x = stack.pop();
        sort(stack);
        insert(stack, x);
    }

    static void insert(Stack<Integer> stack, int x) {
        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();
        insert(stack, x);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sort(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}