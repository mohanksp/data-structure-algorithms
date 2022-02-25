package educative.ds.graph;

import java2blog.list.DoublyLinkedList;

public interface Graph {
    int vertice=0;
    DoublyLinkedList<Integer> adjacencyList[]= new DoublyLinkedList[1]; //

    void printGraph();
    void addEdge(Integer source, Integer target);
}
