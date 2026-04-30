import java.util.*;

class MyQueue {

    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    
    public void enqueue(int x) {
        inStack.push(x);
    }

    
    public int dequeue() {
        shiftStacks();
        if (outStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return outStack.pop();
    }

    
    public int peek() {
        shiftStacks();
        if (outStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return outStack.peek();
    }
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void shiftStacks() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); 
        System.out.println(q.peek());    
        System.out.println(q.dequeue());
        System.out.println(q.dequeue()); 
    }
}