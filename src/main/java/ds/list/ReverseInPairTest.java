package ds.list;

public class ReverseInPairTest {
    public static void main(String[] args) {
        System.out.println("ReverseInPairTest");

        Node<Integer> loopNode=new Node<>(7);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.insertAtLast(new Node<>(5));
        list1.insertAtLast(new Node<>(6));
        list1.insertAtLast(loopNode);
        list1.insertAtLast(new Node<>(1));
        list1.insertAtLast(new Node<>(2));
        list1.insertAtLast(new Node<>(8));
        list1.printList();

        Node<Integer> reverseList = reverseInPair1(list1.getHead());

        while(reverseList !=null){
            reverseList.display();
            reverseList = reverseList.next;
        }

    }

    private static Node<Integer> reverseInPair1(Node<Integer> head) {
        Node<Integer> temp = null;
        Node<Integer> current = head;
        Node<Integer> newHead = null;

        while(current != null && current.next !=null){
            if(temp != null){
                temp.next.next = current.next;
            }
            temp = current.next;
            current.next = temp.next;
            temp.next = current;
            if(newHead == null){
                newHead = temp;
            }
            current = current.next;
        }
        return newHead;
    }

    //recursive approach
    private static Node<Integer> reverseInPair2(Node<Integer> head) {
        return null;
    }
}
