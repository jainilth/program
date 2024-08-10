class DoublyLL {
    static class Node {
        int info;
        Node lptr;
        Node rptr;

        public Node(int data) {
            info = data;
            lptr = null;
            rptr = null;
        }
    }

    Node first = null;

    void insertAtFirst(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
            return;
        } else {
            newNode.rptr = first;
            newNode.lptr = null;
            first.lptr = newNode;
            first = newNode;
        }
    }

    void insertAtLast(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
            return;
        } else {
            Node temp = first;
            while (temp.rptr != null) {
                temp = temp.rptr;
            }
            temp.rptr = newNode;
            newNode.lptr = temp;
            newNode.rptr = null;
        }
    }

    int countNode() {
        int n = 1;
        Node temp = first;
        while (temp.rptr != null) {
            temp = temp.rptr;
            n++;
        }
        return n;
    }

    public void deleteSpecify(int index) {
        if (first == null) {
            System.out.println("list undetflow");
            return;
        }
        int count = 1;
        Node save = first;
        Node pred = save;
        if (index == 1) {
            first = first.rptr;
            first.lptr = null;
            return;
        }
        if (index == countNode()) {
            Node temp = first;
            while (temp.rptr.rptr != null) {
                temp = temp.rptr;
            }
            temp.rptr = null;
            return;
        }
        if (index > countNode() || index < 1) {
            System.out.println("node at given index is not available");
            return;
        }
        while (count != index) {
            save = save.rptr;
            if (count == index - 1) {
                pred.rptr = save.rptr;
                save.rptr.lptr = pred;
                return;
            }
            pred = save;
            count++;
        }
    }

    public void printData() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = first;
        do {
            System.out.print(current.info + " ");
            current = current.rptr;
        } while (current != null);
        System.out.println();
    }

    // lab-13-b-73
    void deleteAlter() {
        Node temp = first;
        Node pred = first;
        int count = 1;
        if (first == null) {
            System.out.println("empty");
            return;
        }
        while (temp.rptr != null) {
            temp = temp.rptr;
            pred.rptr = temp.rptr;
            if (count == countNode()) {
                temp.rptr = null;
                return;
            }
            temp = temp.rptr;
            temp.lptr = pred;
            pred = temp;
            count++;
        }
    }

}

public class Dubly {
    public static void main(String[] args) {
        DoublyLL l1 = new DoublyLL();
        l1.insertAtFirst(10);
        l1.insertAtLast(20);
        l1.insertAtLast(30);
        l1.insertAtLast(40);
        l1.insertAtLast(50);
        l1.insertAtLast(60);
        l1.insertAtLast(70);
        System.out.println(l1.countNode());
        // l1.deleteSpecify(5);
        l1.deleteAlter();
        l1.printData();
    }
}
