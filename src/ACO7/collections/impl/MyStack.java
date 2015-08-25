package ACO7.collections.impl;

/**
 * Created by acer on 21.08.2015.
 */
import ACO7.collections.IStack;

import java.util.EmptyStackException;

public class MyStack<E> extends MyList<E> implements IStack<E> {

    @Override
    public E push(E e) {
        add(e);
        return e;
    }

    @Override
    public E pop() {
        checkEmptiness();
        E elem = get(size() - 1);
        remove(size() - 1);
        return elem;
    }

    private void checkEmptiness() {
        if (isEmpty()) {
//      throw new StackEmptyException();
            throw new EmptyStackException();
        }
    }

    @Override
    public E peek() {
        checkEmptiness();
        return get(size() - 1);
    }
}
