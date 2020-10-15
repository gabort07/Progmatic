package com.company.Feladatok;

public class Counter {
    int value;
    int firstValue;

    public Counter() {
        this.value = 0;
        this.firstValue = 0;
    }

    public Counter(int value) {
        this.value = value;
        this.firstValue = value;
    }

    public void add() {
        this.value++;
    }

    public void add(int number) {
        this.value += number;
    }

    public int get() {
        return value;
    }

    public void reset() {
        this.value = 0;
    }
}
