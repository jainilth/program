import org.w3c.dom.Node;

class LL2 {
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
    void reverce(){
        Node temp=first;
        Node prev=null;
        Node new1=null;
        while(temp!=null){
            new1=temp.link;
            temp.link=prev;
            prev=temp;
            temp=new1;
        }
        first=prev;
    }
}
public class reverce {
    public static void main(String[] args) {
        LL2 l1=new LL2();
        l1.insertAtFirst(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.insertAtEnd(30);
        l1.insertAtEnd(40);
        l1.insertAtEnd(45);
        l1.insertAtEnd(45);
        l1.display();
        l1.reverce();
        l1.display();
    }
}
