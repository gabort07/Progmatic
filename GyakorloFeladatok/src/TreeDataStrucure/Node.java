package TreeDataStrucure;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    T value;
    private List<Node<T>> children;

    public Node(T data) {
        this.value = data;
        this.children = new ArrayList<>();
    }

    public Node() {
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public T getValue() {
        return value;
    }

    public Node<T> findValue(T value) {
        if (!children.isEmpty()) {
            for (Node<T> actual : children) {
                if (actual.getValue().equals(value)) {
                    return actual;
                } else {
                    findValue(value);
                }
            }
        }
        return null;
    }

    public void addToNode(Node<T> newNode){
        children.add(newNode);
    }
}