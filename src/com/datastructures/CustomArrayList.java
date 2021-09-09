package com.datastructures;

import java.util.Arrays;

public class CustomArrayList implements CustomList {
    int[] array;
    int length;


    public CustomArrayList() {
        this.array = new int[100];
        this.length = 0;
    }

    @Override
    public String toString() {
        String msg = "";
        for (int i = 0; i < this.length; i++) {
            msg += this.array[i];
            msg += " ";

        }


        return msg;
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public int capacity() {
        return this.array.length;
    }

    public int[] getArray() {
        return array;
    }

    public void append(int new_element) {
        this.array[this.length] = new_element;
        this.length += 1;
    }

}
