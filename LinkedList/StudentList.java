class StudentList {

    class Node {
        int roll;
        String name;
        int age;
        String grade;
        Node next;

        Node(int r, String n, int a, String g) {
            roll = r;
            name = n;
            age = a;
            grade = g;
        }
    }

    Node head;

    void addFirst(int r, String n, int a, String g) {
        Node newNode = new Node(r, n, a, g);
        newNode.next = head;
        head = newNode;
    }

    void addLast(int r, String n, int a, String g) {
        Node newNode = new Node(r, n, a, g);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void addAtPosition(int pos, int r, String n, int a, String g) {
        if (pos == 0) {
            addFirst(r, n, a, g);
            return;
        }
        Node newNode = new Node(r, n, a, g);
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) return;

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteByRoll(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    Node search(int roll) {
        Node temp = head;
        while (temp != null) {
            if (temp.roll == roll)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    void updateGrade(int roll, String newGrade) {
        Node node = search(roll);
        if (node != null)
            node.grade = newGrade;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        StudentList list = new StudentList();

        list.addFirst(1, "Aman", 20, "A");
        list.addLast(2, "Ravi", 21, "B");
        list.addLast(3, "Sita", 19, "A");
        list.addAtPosition(1, 4, "Neha", 22, "C");

        list.display();

        list.deleteByRoll(2);
        System.out.println("After deletion:");
        list.display();

        System.out.println("Search Roll 3:");
        Node s = list.search(3);
        if (s != null)
            System.out.println(s.name);

        list.updateGrade(3, "A+");
        System.out.println("After update:");
        list.display();
    }
}