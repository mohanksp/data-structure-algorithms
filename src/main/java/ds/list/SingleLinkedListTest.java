package ds.list;


public class SingleLinkedListTest {
    public static void main(String[] args) {
        System.out.println("SingleLinkedListTest");
        SinglyLinkedList<Integer> myLinkedlist = new SinglyLinkedList<>();
        myLinkedlist.insertFirst(5);
        myLinkedlist.insertFirst(6);
        myLinkedlist.insertFirst(7);
        myLinkedlist.insertFirst(1);
        myLinkedlist.insertLast(2);
        myLinkedlist.printLinkedList();
        // Linked list will be
        // 2 -> 1 ->  7 -> 6 -> 5
        Node<Integer> node = new Node<>(1);
        myLinkedlist.deleteAfter(node);
        // After deleting node after 1,Linked list will be
        // 2 -> 1 -> 6 -> 5
        myLinkedlist.printLinkedList();
    }
}
