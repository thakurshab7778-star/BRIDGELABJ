class Inventory {

    class Node {
        int id;
        String name;
        int quantity;
        double price;
        Node next;

        Node(int i, String n, int q, double p) {
            id = i;
            name = n;
            quantity = q;
            price = p;
        }
    }

    Node head;

    void addFirst(int i, String n, int q, double p) {
        Node newNode = new Node(i, n, q, p);
        newNode.next = head;
        head = newNode;
    }

    void addLast(int i, String n, int q, double p) {
        Node newNode = new Node(i, n, q, p);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    void addAtPosition(int pos, int i, String n, int q, double p) {
        if (pos == 0) {
            addFirst(i, n, q, p);
            return;
        }
        Node temp = head;
        for (int j = 0; j < pos - 1 && temp != null; j++)
            temp = temp.next;

        if (temp == null) return;

        Node newNode = new Node(i, n, q, p);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeById(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.id != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    void updateQuantity(int id, int newQty) {
        Node temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    Node searchById(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void searchByName(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equals(name))
                System.out.println(temp.id + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.id + " " + temp.name + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    double totalValue() {
        double sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.quantity * temp.price;
            temp = temp.next;
        }
        return sum;
    }

    Node merge(Node a, Node b, boolean byName, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;

        boolean cond;
        if (byName)
            cond = asc ? a.name.compareTo(b.name) <= 0 : a.name.compareTo(b.name) > 0;
        else
            cond = asc ? a.price <= b.price : a.price > b.price;

        Node result;
        if (cond) {
            result = a;
            result.next = merge(a.next, b, byName, asc);
        } else {
            result = b;
            result.next = merge(a, b.next, byName, asc);
        }
        return result;
    }

    Node getMid(Node head) {
        if (head == null) return head;
        Node slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node mergeSort(Node head, boolean byName, boolean asc) {
        if (head == null || head.next == null) return head;

        Node mid = getMid(head);
        Node next = mid.next;
        mid.next = null;

        Node left = mergeSort(head, byName, asc);
        Node right = mergeSort(next, byName, asc);

        return merge(left, right, byName, asc);
    }

    void sortByName(boolean asc) {
        head = mergeSort(head, true, asc);
    }

    void sortByPrice(boolean asc) {
        head = mergeSort(head, false, asc);
    }

    public static void main(String[] args) {

        Inventory inv = new Inventory();

        inv.addLast(1, "Pen", 10, 5.0);
        inv.addLast(2, "Book", 5, 50.0);
        inv.addLast(3, "Pencil", 20, 2.0);
        inv.addFirst(4, "Eraser", 15, 3.0);

        inv.display();

        System.out.println("Total Value: " + inv.totalValue());

        inv.updateQuantity(2, 8);

        System.out.println("Search ID 3:");
        Node n = inv.searchById(3);
        if (n != null) System.out.println(n.name);

        System.out.println("Sort by Name Asc:");
        inv.sortByName(true);
        inv.display();

        System.out.println("Sort by Price Desc:");
        inv.sortByPrice(false);
        inv.display();
    }
}