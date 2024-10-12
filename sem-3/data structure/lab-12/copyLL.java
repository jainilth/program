//  Insert a node at the front of the linked list. 
//  Display all nodes. 
//  Delete a first node of the linked list. 
//  Insert a node at the end of the linked list. 
//  Delete a last node of the linked list. 
//  Delete a node from specified position.
class LL {
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
    void findMiddle(){
        Node temp=first;
        Node newNode=first;
        while (newNode.link != null&&newNode.link.link!=null) {
            temp = temp.link;
            newNode = newNode.link.link;
        }
        System.out.println(temp.info);
    }
    void lastKthFind(int k){
        Node temp=first;
        int count=1;
        while(temp.link!=null&&count<(k)){
            temp=temp.link;
            count++;
        }
        System.out.println(temp.info);
    }
    void copyLL() {
        Node temp = first;
        Node head = null;
        Node tail = null;
        System.out.println("");
        while (temp != null) {
            Node newNode = new Node(temp.info);
            if (head == null) {
                head = newNode;
                tail = newNode;
                System.out.print(head.info + " ");
            } else {
                tail.link = newNode;
                tail = tail.link;
                System.out.print(tail.info + " ");
            }
            temp = temp.link;
        }
    }
}

public class copyLL {
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.insertAtFirst(1);
        l1.insertAtEnd(20);
        l1.insertAtEnd(25);
        l1.insertAtEnd(30);
        l1.insertAtEnd(35);
        l1.insertAtEnd(40);
        l1.insertAtEnd(45);
        l1.insertAtEnd(50);
        l1.lastKthFind(3);
        l1.display();
        l1.copyLL();
    }
}
