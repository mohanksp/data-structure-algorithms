package java2blog.list;

public class FindNthNodeFromEndTest {
    public static void main(String[] args) {
        System.out.println("Find Nth Node From End Test");
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

        Node<Integer> nthNodeFromEnd = findNthNodeFromEnd(myLinkedlist.getHead(), 2);
        if (nthNodeFromEnd != null) {
            nthNodeFromEnd.display();
        }
    }

    private static Node<Integer> findNthNodeFromEnd(Node<Integer> head, int nthFromLast) {
        int length = 0;
        Node<Integer> temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        int fromStarting = length - nthFromLast;
        Node<Integer> nthNode = null;
        if (fromStarting >= 0) {
            nthNode = head;
        }
        while (fromStarting > 0) {
            nthNode = nthNode.next;
            fromStarting--;
        }
        return nthNode;
    }
}
