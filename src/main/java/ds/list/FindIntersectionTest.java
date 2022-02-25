package ds.list;

public class FindIntersectionTest {
    public static void main(String[] args) {
        System.out.println("FindIntersectionTest");
        Node<Integer> loopNode = new Node<>(7);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.insertAtLast(new Node<>(5));
        list1.insertAtLast(new Node<>(6));
        list1.insertAtLast(loopNode);
        list1.insertAtLast(new Node<>(1));
        list1.insertAtLast(new Node<>(2));
        list1.printList();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.insertAtLast(new Node<>(5));
        list2.insertAtLast(new Node<>(6));
        list2.insertAtLast(loopNode);
        list2.insertAtLast(new Node<>(1));
        list2.insertAtLast(new Node<>(2));
        list2.printList();

        findIntersection(list1.getHead(), list2.getHead());
    }

    private static void findIntersection(Node<Integer> head1, Node<Integer> head2) {
        int length1 = 0, length2 = 0;
        Node<Integer> temp1 = head1;
        Node<Integer> temp2 = head2;

        while (temp1 != null) {
            temp1 = temp1.next;
            length1++;
        }

        while (temp2 != null) {
            temp2 = temp2.next;
            length2++;
        }

        if (length1 > length2) {

        } else {

        }


    }
}
