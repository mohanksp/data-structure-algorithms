package ds.list;

public class LinkedList<T> {
    private Node<T> head;

    public boolean isEmpty() {
        return head == null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public void insertAtFirst(Node<T> node) {
        Node<T> temp = head;
        node.next = temp;
        head = node;
    }

    public void insertAtLast(Node<T> node) {
        if (isEmpty()) {
            head = node;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAfter(Node<T> node) {
        Node<T> temp = head;
        while (temp != null && temp.data != node.data) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void insertBefore(Node<T> node) {
        Node<T> temp = head;
        Node<T> pre = null;
        while (temp != null && temp.data != node.data) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = node;
        node.next = temp;
    }

    public Node<T> deleteAtFirst() {
        Node<T> deletedNode = head.next;
        head = head.next;
        return deletedNode;
    }

    public Node<T> deleteAtLast() {
        Node<T> deletedNode = head;
        Node<T> temp = head;
        Node<T> pre = null;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        deletedNode = pre.next;
        pre.next = null;
        return deletedNode;
    }

    public Node<T> deleteAfter(Node<T> node) {
        Node<T> temp = head;
        while (temp != null && temp.data != node.data) {
            temp = temp.next;
        }
        Node<T> deletedNode = temp.next;
        temp.next = deletedNode.next;
        return deletedNode;
    }

    public Node<T> deleteBefore(Node<T> node) {

        return null;
    }

    public void printList() {
        System.out.println("printing linked list from head -> last");
        Node<T> temp = head;
        while (temp != null) {
            temp.display();
            temp = temp.next;
        }
        System.out.println("");
    }
}
