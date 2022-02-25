package java2blog.list;

public class ReverseListTest {
    public static void main(String[] args) {
        System.out.println("ReverseListTest");
        SinglyLinkedList<Integer> myLinkedlist = new SinglyLinkedList<>();
        myLinkedlist.insertFirst(5);
        myLinkedlist.insertFirst(6);
        myLinkedlist.insertFirst(7);
        myLinkedlist.insertFirst(1);
        myLinkedlist.insertLast(2);
        myLinkedlist.printLinkedList();
        // Linked list will be
        // 1 -> 7 -> 6 -> 5 -> 2
        //Node<Integer> head = reverseList1(myLinkedlist.getHead());
        Node<Integer> head = reverseList2(null, myLinkedlist.getHead());
        myLinkedlist.setHead(head);
        myLinkedlist.printLinkedList();

    }

    //tail recursion
    private static Node<Integer> reverseList2(Node<Integer> pre, Node<Integer> current) {

        if(current == null || current.next==null){
            current.next = pre; // reversing the link
            return current;
        } else {
            Node<Integer> nextNode = current.next; //store next node ref
            current.next = pre; // reversing the link
            pre = current; //move pre to next node
            current = nextNode; // move current to next node
        }
        return reverseList2(pre, current);
    }

    private static Node<Integer> reverseList1(Node<Integer> current) {
        Node<Integer> pre = null; // for first node pre will be null
        Node<Integer> nextNode;
        while (current != null) {
            nextNode = current.next; //store next node ref
            current.next = pre; // reversing the link
            pre = current; //move pre to next node
            current = nextNode; // move current to next node
        }
        return pre;
    }


}
