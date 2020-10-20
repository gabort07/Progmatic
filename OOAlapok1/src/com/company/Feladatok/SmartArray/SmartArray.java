package com.company.Feladatok.SmartArray;

public class SmartArray {
    private int[] array1;
    private int index;
    private int[] tempArray;

    public SmartArray() {
        this.index = 0;
        this.array1 = new int[10];
        tempArray = new int[array1.length];
    }

    public SmartArray(int[] array) {
        this.array1 = new int[array.length + 10];
        array1 = array;
        this.index = array.length - 1;
        tempArray = new int[array.length];
    }

    //    adds an element to the end of this SmartArray, extending it’s size by one
    public void add(int val) {
        if (index < array1.length) {
            array1[index] = val;
            index++;
        } else {
            tempArray = new int[index + 10];
            tempArray = array1;
            array1 = new int[tempArray.length];
            array1 = tempArray;
            array1[index] = val;
            index++;
        }
    }

    //    gets the element at index idx
    public int get(int idx) {
        return array1[idx];
    }

    //    sets the idxth element to val
    public int set(int idx, int val) {
        int get = idx;
        array1[idx] = val;
        return get;
    }

    //    returns the size of this SmartArray
    public int size() {
        return this.array1.length;
    }
}
