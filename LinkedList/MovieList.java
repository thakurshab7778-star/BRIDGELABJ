class MovieList {

    class Node {
        String title;
        String director;
        int year;
        double rating;
        Node next, prev;

        Node(String t, String d, int y, double r) {
            title = t;
            director = d;
            year = y;
            rating = r;
        }
    }

    Node head, tail;

    void addFirst(String t, String d, int y, double r) {
        Node n = new Node(t, d, y, r);
        if (head == null) {
            head = tail = n;
            return;
        }
        n.next = head;
        head.prev = n;
        head = n;
    }

    void addLast(String t, String d, int y, double r) {
        Node n = new Node(t, d, y, r);
        if (tail == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        n.prev = tail;
        tail = n;
    }

    void addAtPosition(int pos, String t, String d, int y, double r) {
        if (pos == 0) {
            addFirst(t, d, y, r);
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addLast(t, d, y, r);
            return;
        }

        Node n = new Node(t, d, y, r);
        n.next = temp.next;
        n.prev = temp;
        temp.next.prev = n;
        temp.next = n;
    }

    void removeByTitle(String title) {
        Node temp = head;

        while (temp != null) {
            if (temp.title.equals(title)) {

                if (temp == head)
                    head = temp.next;

                if (temp == tail)
                    tail = temp.prev;

                if (temp.prev != null)
                    temp.prev.next = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                return;
            }
            temp = temp.next;
        }
    }

    void searchByDirector(String director) {
        Node temp = head;
        while (temp != null) {
            if (temp.director.equals(director))
                System.out.println(temp.title);
            temp = temp.next;
        }
    }

    void searchByRating(double rating) {
        Node temp = head;
        while (temp != null) {
            if (temp.rating == rating)
                System.out.println(temp.title);
            temp = temp.next;
        }
    }

    void updateRating(String title, double newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {

        MovieList list = new MovieList();

        list.addFirst("Movie1", "Dir1", 2020, 8.5);
        list.addLast("Movie2", "Dir2", 2021, 7.8);
        list.addLast("Movie3", "Dir1", 2019, 9.0);
        list.addAtPosition(1, "Movie4", "Dir3", 2022, 6.5);

        list.displayForward();

        System.out.println("After removal:");
        list.removeByTitle("Movie2");
        list.displayForward();

        System.out.println("Search by Director Dir1:");
        list.searchByDirector("Dir1");

        System.out.println("Search by Rating 9.0:");
        list.searchByRating(9.0);

        list.updateRating("Movie3", 9.5);

        System.out.println("Reverse Display:");
        list.displayReverse();
    }
}