import java.util.*;

import org.w3c.dom.Node;

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


    void deleteDuplicate() {
        // Node temp = first;
        // Node save = first;
        // while (temp.link != null) {
        //     if (temp.info == temp.link.info) {
        //         temp = temp.link;
        //     } else {
        //         System.out.print(save.info + " ");
        //         temp = temp.link;
        //         save.link = temp;
        //     }
        // }
        Node temp = first;
        Node save = first;
        while (temp.link != null) {
            if (temp.info == temp.link.info) {
                temp.link= temp.link.link;
            } else {
                System.out.print(save.info + " ");
                temp = temp.link;
                save = temp;
            }
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
        l1.insertAtFirst(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.insertAtEnd(30);
        l1.insertAtEnd(40);
        l1.insertAtEnd(45);
        l1.insertAtEnd(45);
        l1.display();
        System.out.println("");
        l1.deleteDuplicate();

        // list.copyLL();
    }
}
