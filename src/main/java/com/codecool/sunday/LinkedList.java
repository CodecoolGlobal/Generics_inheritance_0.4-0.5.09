package com.codecool.sunday;

public class LinkedList<T> {
    private T element;
    private LinkedList<T> next;

    public LinkedList(T element) {
        this.element = element;
        this.next = null;
    }

    public void addElement(T element) {
        if (next == null) {
            this.next = new LinkedList<T>(element);
        } else {
            next.addElement(element);
        }
    }

    public T getElement(int index) {
        if (index == 0) {
            return element;
        }

        return next.getElement(index - 1);
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
