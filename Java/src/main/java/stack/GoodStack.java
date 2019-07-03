package stack;
import java.util.List;
import java.util.LinkedList;

public class GoodStack<T> implements Stack<T>{

    List<T> contents = new LinkedList<>();

    @Override
    public void push(T item) {
        contents.add(0, item);
    }

    @Override
    public T pop() {
        T element = contents.remove(0);
        return element;
    }

    @Override
    public T peek() {
        return contents.get(0);
    }

    @Override
    public boolean isEmpty() {
        return contents.size() == 0;
    }
}
