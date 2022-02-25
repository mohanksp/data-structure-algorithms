package java2blog.list;

public class CheckPalindromeTest {
    public static void main(String[] args) {
        System.out.println("CheckPalindromeTest");

        LinkedList<Integer> list = new LinkedList<>();
        Node<Integer> loopNode=new Node<>(1);
        list.insertAtLast(new Node<>(1));
        list.insertAtLast(new Node<>(2));
        list.insertAtLast(loopNode);
        list.insertAtLast(new Node<>(2));
        list.insertAtLast(new Node<>(1));

        list.printList();
        boolean isPalindrome =  checkPalindrome(list.getHead());
        if(isPalindrome)
            System.out.println("list is palindrome");
        else
            System.out.println("list is not palindrome");
    }

    private static boolean checkPalindrome(Node<Integer> head) {
        StringBuilder builder = new StringBuilder();
        Node<Integer> temp = head;
        while (temp != null){
            builder.append(temp.data);
            temp = temp.next;
        }
        return builder.toString().equals(builder.reverse().toString());
    }

}
