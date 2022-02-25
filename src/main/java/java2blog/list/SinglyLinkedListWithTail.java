package java2blog.list;

public class SinglyLinkedListWithTail<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public void insertAtHead(Node<T> node){

    }

    public void insertAtTail(Node<T> node){

    }




}
