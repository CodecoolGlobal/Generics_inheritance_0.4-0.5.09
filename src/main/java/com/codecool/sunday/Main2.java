package com.codecool.sunday;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Integer someInteger = 10;
        Object someObject = someInteger;

        Box<Number> box = new Box<>();
        box.setInside(10);
        box.setInside(10.1);

        Box<Integer> box2 = new Box<>();

        // boxOperation(box);
        boxOperation2(box2);

        List<String> list = new ArrayList<>();

        Object a = pick("d", new Box<String>());
//        Serializable a1 = pick("d", new Box<String>());  error

        Box.showFirst(2, "xd");
        Box.<Integer>showFirst(2, 3);
        Box.showFirst(2, 3);

    }

    static void showFirst(List<?> list) {
        System.out.println(list.get(0));
    }

    static void showFirst2(List<? super Integer> list) {
        System.out.println(list.get(0));
    }


    static <T> T pick(T x, T y) {
        return x;
    }

    //

    public static void boxOperation(Box<Number> n) { /* ... */}

    public static <T extends Number> void boxOperation2(Box<T> n) { /* ... */}
}
