package bai_tap.deploy_method_arraylist;

import bai_tap.deploy_method_linkedlist.MyLinkedList;

import java.sql.Date;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            this.elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }

    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapacity(5);
        }
        elements[size++] = element;
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (size == elements.length) {
            ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        }

    }


    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public E remove(int index) {
        checkIndex(index);
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean contains(E element) {
        return this.indexOf(element)>=0;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }
    public MyList<E> clone(){
        MyList<E> cloneList = new MyList<>();
        cloneList.elements = Arrays.copyOf(elements,size);
        cloneList.size = this.size;
        return cloneList;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }
}
