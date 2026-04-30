package LinkedList;

public class TaskSchedule {

    class Node {
        int id;
        String name;
        int priority;
        String dueDate;
        Node next;

        Node(int i, String n, int p, String d) {
            id = i;
            name = n;
            priority = p;
            dueDate = d;
        }
    }

    Node head, current;

    void addFirst(int i, String n, int p, String d) {
        Node newNode = new Node(i, n, p, d);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) temp = temp.next;

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    void addLast(int i, String n, int p, String d) {
        Node newNode = new Node(i, n, p, d);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        Node temp = head;
        while (temp.next != head) temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    void addAtPosition(int pos, int i, String n, int p, String d) {
        if (pos == 0) {
            addFirst(i, n, p, d);
            return;
        }

        Node temp = head;
        for (int j = 0; j < pos - 1 && temp.next != head; j++)
            temp = temp.next;

        Node newNode = new Node(i, n, p, d);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeById(int id) {
        if (head == null) return;

        Node curr = head, prev = null;

        do {
            if (curr.id == id) {

                if (curr == head) {
                    Node temp = head;
                    while (temp.next != head) temp = temp.next;

                    if (head == head.next) {
                        head = null;
                        current = null;
                        return;
                    }

                    head = head.next;
                    temp.next = head;
                    current = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void viewCurrent() {
        if (current != null)
            System.out.println(current.id + " " + current.name);
    }

    void moveNext() {
        if (current != null)
            current = current.next;
    }

    void display() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.println(temp.id + " " + temp.name + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int p) {
        if (head == null) return;

        Node temp = head;
        do {
            if (temp.priority == p)
                System.out.println(temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {

        TaskSchedule ts = new TaskSchedule();

        ts.addFirst(1, "Task1", 2, "10-05");
        ts.addLast(2, "Task2", 1, "12-05");
        ts.addLast(3, "Task3", 3, "15-05");
        ts.addAtPosition(1, 4, "Task4", 2, "11-05");

        ts.display();

        System.out.println("Current Task:");
        ts.viewCurrent();

        ts.moveNext();
        System.out.println("Next Task:");
        ts.viewCurrent();

        System.out.println("Search Priority 2:");
        ts.searchByPriority(2);

        ts.removeById(2);
        System.out.println("After deletion:");
        ts.display();
    }
} 
