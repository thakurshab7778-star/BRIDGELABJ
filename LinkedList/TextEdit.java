class TextEdit {

    class Node {
        String text;
        Node prev, next;

        Node(String t) {
            text = t;
        }
    }

    Node head, tail, current;
    int size = 0, limit = 10;

    void addState(String text) {

        Node n = new Node(text);

        if (current != null) {
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = n;
            current = n;
            size = 1;
            return;
        }

        tail.next = n;
        n.prev = tail;
        tail = n;
        current = n;
        size++;

        if (size > limit) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    void displayCurrent() {
        if (current != null)
            System.out.println(current.text);
    }

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addState("A");
        editor.addState("AB");
        editor.addState("ABC");
        editor.addState("ABCD");

        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.undo();
        editor.displayCurrent();

        editor.redo();
        editor.displayCurrent();

        editor.addState("ABCDE");

        editor.displayCurrent();
    }
}