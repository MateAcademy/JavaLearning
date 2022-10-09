package com.collections.stack;

import java.util.NoSuchElementException;

/**
 * @author Sergey Klunniy
 */
public class MyStack {
    private int[] stck = new int[10];
    private int tos = -1;

    public MyStack() {
        tos = -1;
    }

    public void push(int elem) {
        if (tos < 10) {
            stck[++tos] = elem;
        } else {
            System.out.println("Stack заполнен");
        }
    }

    public int pop() throws NoElementException {
        if (tos < 0) {
            System.out.println("Stack пустой");
            throw new NoElementException();
        } else {
            return stck[tos--];
        }
    }
}

class NoElementException extends Exception {
}