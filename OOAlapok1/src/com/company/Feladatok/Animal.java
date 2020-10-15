package com.company.Feladatok;

public class Animal {

    int hungry;
    int thirsty;

    public Animal() {
        this.hungry = 50;
        this.thirsty = 50;
    }

    public Animal(int hungry, int thirsty) {
        this.hungry = 50 + hungry;
        this.thirsty = 50 + thirsty;
    }

    public void eat() {
        hungry--;
    }

    public void drink() {
        thirsty--;
    }

    public void play() {
        hungry++;
        thirsty++;
    }
}
