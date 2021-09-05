package com.codecool.sunday;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        String string = "coś";

        box.setInside(string);
        String inside = box.getInside();

        String fromBox = box.getInside();

        // Zad 2

//        String tab[] = new String[2];
//        tab[0] = "0";
//        tab[1] = "1";
//        printArray(tab);

        // stos i kolejka
        // List<> Map<>

        Queue<String> queue = new ArrayDeque<>();

        queue.add("1");
        queue.add("2");
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());

        // Stos
//
//             |
//             | 2
//             | 1
//        __________

        // Kolejka

//           10      5     1
//        --------------------
//

        Integer x = 5;
        Integer y = 4;

        System.out.println(x > y);
        System.out.println(x.compareTo(y) > 0);
//        System.out.println(x.>(y)  0);

//        Comparable<T>
        String tab[] = new String[2];
        tab[0] = "0";
        tab[1] = "1";
        printArray(tab);
//        printArrayGenerics(tab);
        LinkedList<String> stringList = new LinkedList<>("Hay");
        stringList.addElement("Hedo");

        System.out.println();
    }

    public static void printArray(Object[] input) {
        for (Object el : input) {
            System.out.print(el.toString() + ", ");
        }
        System.out.println();
    }

    public static <T extends Number> void printArrayGenerics(T[] input) {
        for (T el : input) {
            System.out.print(el.toString() + ", ");
        }
        System.out.println();
    }


}
