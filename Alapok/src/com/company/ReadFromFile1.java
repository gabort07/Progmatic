package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile1 {

    public static int[][] data = new int[10][2];

    public static void main(String[] args) throws FileNotFoundException {

//        Scanner sc = new Scanner(new File("fájlok/ocean.txt"));
//
//        while (sc.hasNext()) {
//            String line = sc.nextLine();
//            System.out.println(line);
//        }

        readFromFile1("fájlok/borbala.txt");

//        1. módszer
//        Scanner sc = new Scanner(new File("fájlok/temps.txt"));

//
//        for(int i = 0; sc.hasNext(); i++){
//            data[i][0] = sc.nextInt();
//            data[i][1] = sc.nextInt();
//        }
//        readFromFile2("fájlok/temps.txt");
//        System.out.println(Arrays.deepToString(data));

//        2.módszer
//        for (int i = 0; sc.hasNext(); i++) {
//            String row = sc.nextLine();
//            System.out.println(row);
//            String[] parts = row.split(" ");
//            data[i][0] = Integer.parseInt(parts[0]);
//            data[i][1] = Integer.parseInt(parts[1]);
//        }

//        readFromFile3("fájlok/temps.txt", data);
//        System.out.println(Arrays.deepToString(data));

    }

    public static void readFromFile1(String pathName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(pathName));
        while (sc.hasNextLine()) {
            String line= sc.nextLine();
            System.out.println(line);
        }
    }

    public static void readFromFile2(String pathName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(pathName));
        for (int i = 0; sc.hasNext(); i++) {
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt();
        }
    }

    public static void readFromFile3(String pathName, int[][] data) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(pathName));
        for (int i = 0; sc.hasNext(); i++) {
            String row = sc.nextLine();
//            System.out.println(row);
            String[] parts = row.split(" ");
            data[i][0] = Integer.parseInt(parts[0]);
            data[i][1] = Integer.parseInt(parts[1]);
        }
//        System.out.println(Arrays.deepToString(data));

    }
}
