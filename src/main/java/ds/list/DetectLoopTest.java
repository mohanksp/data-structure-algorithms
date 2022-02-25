package ds.list;

public class DetectLoopTest {
    public static void main(String[] args) {
        System.out.println("DetectLoopTest");
        LinkedList<Integer> list = new LinkedList<>();
        // Creating a linked list
        Node<Integer> loopNode=new Node<>(7);
        list.insertAtLast(new Node<>(5));
        list.insertAtLast(new Node<>(6));
        list.insertAtLast(loopNode);
        list.insertAtLast(new Node<>(1));
        list.insertAtLast(new Node<>(2));

        list.printList();
        // creating a loop
        //list.insertAtLast(loopNode);
        //list.printList();

        boolean isLoopExist = detectLoop(list.getHead());
        if(isLoopExist)
            System.out.println("loop detected");
        else
            System.out.println("loop not detected");
    }

    private static boolean detectLoop(Node<Integer> head) {
        boolean isLoopExist = false;
        Node<Integer> slowPtr = head;
        Node<Integer> fastptr = head;
        while(fastptr.next != null && fastptr.next.next != null){
            slowPtr = slowPtr.next;
            fastptr = fastptr.next.next;
            if(fastptr.next == slowPtr.next && fastptr.data == slowPtr.data){
                isLoopExist = true;
                break;
            }
        }
        return isLoopExist;
    }
}
