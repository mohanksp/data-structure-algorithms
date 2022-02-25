package java2blog.list;

class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public void display() {
        System.out.print(" {" + data + "} ");
    }
}
