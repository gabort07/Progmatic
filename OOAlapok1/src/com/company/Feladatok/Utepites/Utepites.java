package com.company.Feladatok.Utepites;

import java.io.FileNotFoundException;

public class Utepites {
    public static void main(String[] args) throws FileNotFoundException {
        Ut ut = new Ut();
        ut.readFromFile("Files/forgalom.txt");


    }
}
