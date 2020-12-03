package CircleDataStructure;

import java.util.Iterator;
import java.util.LinkedList;

public class Circle<T> implements Iterable<T> {
    LinkedList<T> list = new LinkedList<T>();


    /**
     * Adds an element to the circle.
     * The new element is added right after elementInCircle
     *
     * @param elementInCircle
     * @param newElement
     */
    public void addAfter(T elementInCircle, T newElement) {
        list.add(list.indexOf(elementInCircle) + 1, newElement);
    }

    /**
     * Adds an element to the circle
     * right after the last element that was added by this method
     *
     * @param newElement
     */
    public void add(T newElement) {
        list.add(newElement);
    }


    /**
     * creates an iterator which iterates on this Circle forever
     *
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return new CircleIterator<T>(list);
    }

}

class CircleIterator<T> implements Iterator<T> {
    LinkedList<T> current;
    LinkedList<T> next = new LinkedList<>();

    public CircleIterator(LinkedList<T> list) {
        current = list;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        if (current.isEmpty()) {
            current = next;
        }
        T actual = current.poll();
        next.add(actual);
        return actual;
    }
}