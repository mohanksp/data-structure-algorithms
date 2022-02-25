package ds.list;

public class DNode<T> {
    public T data;
    public DNode<T> next;
    public DNode<T> pre;

    public DNode(T data) {
        this.data = data;
    }

    public void display() {
        System.out.print(" {" + data + "} ");
    }

}
