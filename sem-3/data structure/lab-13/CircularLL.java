class CLL {
    class Node {
        int info;
        Node link;

        public Node(int data) {
            this.info = data;
            this.link = null;
        }
    }

    public Node first;
    public Node last;

    public void insertAtFirst(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            newNode.link = newNode;
            first = last = newNode;
            return;
        } else {
            newNode.link = first;
            last.link = newNode;
            first = newNode;
            return;
        }
    }

    void insertAtLast(int x) {
        Node newNode = new Node(x);
        if (first == null) {
            newNode.link = newNode;
            first = last = newNode;
            return;
        } else {
            newNode.link = first;
            last.link = newNode;
            last = newNode;
            return;
        }
    }

    int countNode() {
        int n = 1;
        Node temp = first;
        while (temp != last) {
            temp = temp.link;
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
            first = first.link;
            return;
        }
        if (index == countNode()) {
            Node temp = first;
            while (temp.link != last) {
                temp = temp.link;

            }
            temp.link = temp.link.link;
            last = temp;
            return;
        }
        if (index > countNode() || index < 1) {
            System.out.println("node at given index is not available");
            return;
        }
        while (count != index) {
            save = save.link;
            if (count == index - 1) {
                pred.link = save.link;
                return;
            }
            pred = save;
            count++;
        }
    }

    void splitList() {
        if (first == null) {
            System.out.println("list is empty");
            return;
        }
        if (countNode() == 1) {
            System.out.println(first.info);
            return;
        }
        Node head1 = first;
        Node head2 = first;
        Node tail1 = first;
        Node tail2 = first;
        Node temp = first;
        boolean count = false;
        for (int i = 1; i < countNode(); i++) {
            if (i < countNode() / 2) {
                temp = temp.link;
                head2 = head2.link;
                tail1 = tail1.link;
                tail2 = tail2.link;
            }
            else{
                if(!count){
                    head2=head2.link;
                    count=true;
                }
                temp = temp.link;
                tail2 = tail2.link;
            }
        }
        tail1.link = head1;
        tail2.link = head2;
        Node current = head1;
        do {
            System.out.print(current.info + " ");
            current = current.link;
        } while (current != head1);
        System.out.println();
        Node current2 = head2;
        do {
            System.out.print(current2.info + " ");
            current2 = current2.link;
        } while (current2 != head2);
        System.out.println();
    }

    public void printData() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = first;
        do {
            System.out.print(current.info + " ");
            current = current.link;
        } while (current != first);
        System.out.println();
    }
}

public class CircularLL {
    public static void main(String[] args) {
        CLL l1 = new CLL();
        l1.insertAtFirst(10);
        l1.insertAtLast(20);
        l1.insertAtLast(30);
        l1.insertAtLast(40);
        l1.insertAtLast(50);
        l1.insertAtLast(60);
        l1.insertAtLast(70);
        l1.insertAtLast(80);
        // l1.splitList();
        // l1.deleteSpecify(5);
        // l1.printData();
        System.out.println(l1.countNode());
    }
}
