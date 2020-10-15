package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Futar {

    public static int[] days;
    public static int[] deliveries;
    public static int[] distances;

    public static void main(String[] args) throws FileNotFoundException {
        readFromFile();

//        System.out.println("Az első nap megtett km: " + getDistanceOfDay(1));
//        System.out.println("A hét utolsó napjának utoldó fuvarja " + getLastRideOfDay(7) + "km volt.");
//        getRestDay();
//        getMostRides();
        printSumOfDistances();


    }

    public static void readFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("fájlok/tavok.txt"));

        int rowCounter = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            rowCounter++;
        }

        days = new int[rowCounter];
        deliveries = new int[rowCounter];
        distances = new int[rowCounter];

        sc = new Scanner(new File("fájlok/tavok.txt"));
        for (int i = 0; sc.hasNext(); i++) {
            days[i] = sc.nextInt();
            deliveries[i] = sc.nextInt();
            distances[i] = sc.nextInt();
        }
    }

    public static int getDistanceOfDay(int day) {
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] == day) {
                sum += distances[i];
            }
        }
        return sum;
    }

    public static int getLastRideOfDay(int day) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] == day) {
                if (deliveries[i] > max) {
                    max = deliveries[i];
                    index = i;
                }
            }
        }
        return distances[index];
    }

    public static void getRestDay() {
        int index = 0;
        int[] day = new int[7];
        for (int i = 0; i < days.length; i++) {
            day[days[i] - 1]++;
        }
        System.out.print("A hét ezen napjain volt szabada futár:");
        for (int i = 0; i < day.length; i++) {
            if (day[i] == 0) {
                System.out.print(" " + (i + 1));
            }
        }
        System.out.println();
    }

    public static void getMostRides() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < deliveries.length; i++) {
            if (deliveries[i] > max) {
                max = deliveries[i];
                index = i;
            }
        }
        System.out.println("A legtöbb fuvar a hét " + days[index] + " napján volt, "+ deliveries[index] + " fuvar.");
    }

    public static void printSumOfDistances() {
        int[] dayOfWeek = new int[7];
        for (int i = 0; i < days.length; i++) {
            dayOfWeek[days[i]-1] += distances[i];

        }
        for (int i = 0; i < dayOfWeek.length; i++) {
            System.out.println(i+1 +". nap: "+dayOfWeek[i] + " km");
        }
    }

//    8

    public static void calculateFee(){
        
    }


}

