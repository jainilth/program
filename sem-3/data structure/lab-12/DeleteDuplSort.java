public class DeleteDuplSort {
    public static void main(String[] args) {
        LL l1=new LL();
        l1.insertAtFirst(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.insertAtEnd(30);
        l1.insertAtEnd(40);
        l1.insertAtEnd(45);
        l1.insertAtEnd(45);
        l1.display();
        deleteDuplicate(l1);
    }
    
}
