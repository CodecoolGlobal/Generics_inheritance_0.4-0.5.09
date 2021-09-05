package com.codecool.sunday;

import lombok.Getter;

@Getter
public class Box<T> {

    private T inside;

    public void setInside(T inside) {
        this.inside = inside;
    }

    static <T> void showFirst(T a1, T a2) {
        System.out.println(a1);
    }
}
