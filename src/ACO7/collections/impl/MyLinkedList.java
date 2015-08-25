package ACO7.collections.impl;

import ACO7.collections.IList;

/**
 * Created by acer on 22.08.2015.
 */
public class MyLinkedList<E> implements IList<E>{

    private Node head;
    private Node tail;

    @Override
    public boolean add(E obj, int index) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    private static class Node<E>{
        Node next;
        Node prev;
        E elem;
    }


}
