class RoundRobin {

    class Node {
        int id, burst, priority, remaining, waiting, turnaround;
        Node next;

        Node(int i, int b, int p) {
            id = i;
            burst = b;
            priority = p;
            remaining = b;
        }
    }

    Node head, tail;

    void addProcess(int id, int burst, int priority) {
        Node n = new Node(id, burst, priority);

        if (head == null) {
            head = tail = n;
            n.next = head;
            return;
        }

        tail.next = n;
        n.next = head;
        tail = n;
    }

    void remove(Node prev, Node curr) {
        if (curr == head && curr == tail) {
            head = tail = null;
            return;
        }

        if (curr == head) {
            head = head.next;
            tail.next = head;
        } else if (curr == tail) {
            prev.next = head;
            tail = prev;
        } else {
            prev.next = curr.next;
        }
    }

    void display() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print("P" + temp.id + "(" + temp.remaining + ") ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    void schedule(int quantum) {

        if (head == null) return;

        int time = 0, n = 0;
        Node temp = head;
        do { n++; temp = temp.next; } while (temp != head);

        int totalWaiting = 0, totalTurnaround = 0;

        Node curr = head, prev = tail;

        while (head != null) {

            if (curr.remaining > 0) {
                int exec = Math.min(quantum, curr.remaining);
                curr.remaining -= exec;
                time += exec;

                Node t = head;
                if (t != null) {
                    do {
                        if (t != curr && t.remaining > 0)
                            t.waiting += exec;
                        t = t.next;
                    } while (t != head);
                }

                if (curr.remaining == 0) {
                    curr.turnaround = time;
                    totalWaiting += curr.waiting;
                    totalTurnaround += curr.turnaround;

                    Node next = curr.next;
                    remove(prev, curr);
                    curr = next;
                    continue;
                }
            }

            prev = curr;
            curr = curr.next;

            display();
        }

        System.out.println("Avg Waiting Time: " + (double) totalWaiting / n);
        System.out.println("Avg Turnaround Time: " + (double) totalTurnaround / n);
    }

    public static void main(String[] args) {

        RoundRobin rr = new RoundRobin();

        rr.addProcess(1, 5, 1);
        rr.addProcess(2, 3, 2);
        rr.addProcess(3, 7, 1);

        rr.schedule(2);
    }
}