package java2blog.list;

class SinglyLinkedList<T> {
    private Node<T> head;

    public Node<T> getHead() {
        return head;
    }

    public void insertFirst(T data) {
        Node<T> temp = head;
        Node<T> newNode = new Node<>(data);
        newNode.next = temp;
        head = newNode;
    }

    public void insertLast(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<>(data);
        }
    }

    public void deleteAfter(Node<T> node) {
        Node<T> temp = head;
        while (temp.next != null && temp.data != node.data) {
            temp = temp.next;
        }
        temp.next = temp.next != null ? temp.next.next : null;
    }

    public void printLinkedList() {
        System.out.println("printing linkedList head->last");
        Node<T> temp = head;
        while (temp.next != null) {
            temp.display();
            temp = temp.next;
        }
        temp.display();
        System.out.println();
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
}
