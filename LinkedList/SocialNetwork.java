class SocialNetwork {

    class FriendNode {
        int id;
        FriendNode next;

        FriendNode(int i) {
            id = i;
        }
    }

    class UserNode {
        int id;
        String name;
        int age;
        FriendNode friends;
        UserNode next;

        UserNode(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }
    }

    UserNode head;

    void addUser(int id, String name, int age) {
        UserNode u = new UserNode(id, name, age);
        u.next = head;
        head = u;
    }

    UserNode getUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriendConnection(int id1, int id2) {
        UserNode u1 = getUser(id1);
        UserNode u2 = getUser(id2);

        if (u1 == null || u2 == null) return;

        u1.friends = addFriend(u1.friends, id2);
        u2.friends = addFriend(u2.friends, id1);
    }

    FriendNode addFriend(FriendNode head, int id) {
        FriendNode f = new FriendNode(id);
        f.next = head;
        return f;
    }

    void removeFriendConnection(int id1, int id2) {
        UserNode u1 = getUser(id1);
        UserNode u2 = getUser(id2);

        if (u1 == null || u2 == null) return;

        u1.friends = removeFriend(u1.friends, id2);
        u2.friends = removeFriend(u2.friends, id1);
    }

    FriendNode removeFriend(FriendNode head, int id) {
        if (head == null) return null;

        if (head.id == id) return head.next;

        FriendNode temp = head;
        while (temp.next != null && temp.next.id != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;

        return head;
    }

    void displayFriends(int id) {
        UserNode u = getUser(id);
        if (u == null) return;

        FriendNode f = u.friends;
        while (f != null) {
            System.out.print(f.id + " ");
            f = f.next;
        }
        System.out.println();
    }

    void mutualFriends(int id1, int id2) {
        UserNode u1 = getUser(id1);
        UserNode u2 = getUser(id2);

        if (u1 == null || u2 == null) return;

        FriendNode f1 = u1.friends;

        while (f1 != null) {
            if (contains(u2.friends, f1.id))
                System.out.print(f1.id + " ");
            f1 = f1.next;
        }
        System.out.println();
    }

    boolean contains(FriendNode head, int id) {
        while (head != null) {
            if (head.id == id) return true;
            head = head.next;
        }
        return false;
    }

    UserNode searchById(int id) {
        return getUser(id);
    }

    void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equals(name))
                System.out.println(temp.id + " " + temp.age);
            temp = temp.next;
        }
    }

    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println("User " + temp.id + ": " + count);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        SocialNetwork sn = new SocialNetwork();

        sn.addUser(1, "Aman", 20);
        sn.addUser(2, "Ravi", 21);
        sn.addUser(3, "Sita", 19);
        sn.addUser(4, "Neha", 22);

        sn.addFriendConnection(1, 2);
        sn.addFriendConnection(1, 3);
        sn.addFriendConnection(2, 3);
        sn.addFriendConnection(3, 4);

        System.out.println("Friends of 1:");
        sn.displayFriends(1);

        System.out.println("Mutual friends of 1 and 2:");
        sn.mutualFriends(1, 2);

        sn.removeFriendConnection(1, 2);

        System.out.println("After removal:");
        sn.displayFriends(1);

        System.out.println("Search by Name Sita:");
        sn.searchByName("Sita");

        System.out.println("Friend counts:");
        sn.countFriends();
    }
}