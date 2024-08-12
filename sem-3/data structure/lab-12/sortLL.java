import org.w3c.dom.Node;

class LL3 {
    class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public Node first = null;

    void insertAtFirst(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
            return;
        } else {
            newNode.link = first;
            first = newNode;
        }
    }

    void display() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + " ");
            temp = temp.link;
        }
        System.out.println("");
    }

    void insertAtEnd(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            first = newNode;
            return;
        } else {
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    int findGcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        if (a == 0)
            return b;
        else
            return a;
    }

    void gcdNodeList() {
        Node temp = first;
        Node prev = temp;
        while (temp.link != null) {
            temp = temp.link;
            Node newNode = new Node(findGcd(prev.info, temp.info));
            newNode.link = prev.link;
            prev.link = newNode;
            prev = temp;
        }
        display();
    }

    void swapUlternate() {
        Node dummy = new Node(0);
        dummy.link = first;
        Node prev = dummy;
        Node temp;
        Node next;
        while (prev.link != null && prev.link.link != null) {
            temp = prev.link;
            next = temp.link;
            temp.link = next.link;
            next.link = temp;
            prev.link = next;
            prev = temp;
        }
        first = dummy.link;
        display();
    }

    public void swapKthNode(int k) {
        if (first == null || k <= 0||k>countNode()/2) {
            System.out.println("not valid");
            return;
        }

        Node firstNode = first;
        Node firstPrev = null;
        for (int i = 1; i < k && firstNode != null; i++) {
            firstPrev = firstNode;
            firstNode = firstNode.link;
        }

        if (firstNode == null) {
            return; // K is greater than the number of nodes in the list
        }

        Node secondNode = first;
        Node secondPrev = null;
        Node temp = firstNode;
        while (temp.link != null) {
            secondPrev = secondNode;
            secondNode = secondNode.link;
            temp = temp.link;
        }

        if (firstNode == secondNode) {
            return; // Kth node from beginning and end are the same
        }

        if (firstPrev != null) {
            firstPrev.link = secondNode;
        } else {
            first = secondNode;
        }

        if (secondPrev != null) {
            secondPrev.link = firstNode;
        } else {
            first = firstNode;
        }

        Node tempLink = firstNode.link;
        firstNode.link = secondNode.link;
        secondNode.link = tempLink;
        display();
    }

    int countNode() {
        int n = 1;
        Node temp = first;
        while (temp.link != null) {
            temp = temp.link;
            n++;
        }
        return n;
    }

    void sortList() {
        if (first == null) {
            System.out.println("underflow");
            return;
        } else {
            Node prev = first;
            Node next = first;
            while (prev.link != null) {
                next = prev;
                while (next.link != null) {
                    next = next.link;
                    if (prev.info > next.info) {
                        int temp = prev.info;
                        prev.info = next.info;
                        next.info = temp;
                    }
                }
                prev = prev.link;
            }
        }
    }
}

public class sortLL {
    public static void main(String[] args) {
        LL3 l1 = new LL3();
        l1.insertAtFirst(10);
        l1.insertAtEnd(50);
        l1.insertAtEnd(34);
        l1.insertAtEnd(23);
        l1.insertAtEnd(90);
        l1.insertAtEnd(20);
        l1.insertAtEnd(80);
        l1.insertAtEnd(1);
        // l1.sortList();
        // l1.gcdNodeList();
        l1.display();
        l1.swapKthNode(3);
        // l1.swapUlternate();
    }
}
