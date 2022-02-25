package java2blog.list;

public class FindMiddleNodeTest {
    public static void main(String[] args) {
        System.out.println("FindMiddleNodeTest");
        SinglyLinkedList<Integer> myLinkedlist = new SinglyLinkedList<>();
        myLinkedlist.insertFirst(9);
        myLinkedlist.insertFirst(3);
        myLinkedlist.insertFirst(5);
        myLinkedlist.insertFirst(6);
        myLinkedlist.insertFirst(7);
        myLinkedlist.insertFirst(1);
        myLinkedlist.insertLast(2);
        myLinkedlist.printLinkedList();
        // Linked list will be
        // 1 -> 7 -> 6 -> 5 -> 2

        Node<Integer> middleNode = findMiddleNode(myLinkedlist.getHead());
        middleNode.display();
    }

    private static Node<Integer> findMiddleNode(Node<Integer> head) {
        Node<Integer> slowPointer = head;
        Node<Integer> fastPointer = head;

        while(fastPointer.next != null && fastPointer.next.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }


}
