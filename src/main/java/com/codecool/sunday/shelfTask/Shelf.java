package com.codecool.sunday.shelfTask;

import java.util.ArrayList;
import java.util.Collections;

public class Shelf<T extends Comparable<T> & Weightable> {

    private final ArrayList<T> elements;
    private final double maxWeight;

    public Shelf(double maxWeight) {
        this.elements = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addElement(T element) {
        //todo check weight before addition
        elements.add(element);
    }

    public void printElements() {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public void sortElementOnShelf() {
        Collections.sort(elements);
    }
}
