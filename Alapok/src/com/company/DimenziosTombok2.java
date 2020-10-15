package com.company;

public class DimenziosTombok2 {

    private static final String[] CITIES = {"Budapest", "Békéscsaba", "Debrecen", "Eger"};

    private static final int[][] DISTANCES =
            {       //            Bp      Bcsab   Debr    Eger
                    /*Bp*/        {0, 216, 231, 158},
                    /*Békéscsaba*/{216, 0, 137, 200},
                    /*Debrecen*/  {231, 137, 0, 136},
                    /*Eger*/      {158, 200, 136, 0},
            };


    public static void main(String[] args) {

        System.out.println(minOfArrayGreaterThan(DISTANCES,0));
        getClosestCities(DISTANCES);
    }

//    Írj programot, ami bekér a felhasználótól két városnevet, és megmondja,
//    hgy a két város egymástól milyen távolságra van! Ha a felhasználó olyan városok nevét adja meg,
//    amik nem szerepelnek a tömbben, akkor írd ki, hogy "Nincs adat."!

    public static void distanceBetween () {
        
    }

    public static int getDistanceBetween(int[][] array, int city1, int city2) { return array[city1][city2]; }

//    Írj programot, ami megmondja, hogy mekkora a legkisebb távolság két város között!

    public static int minOfArrayGreaterThan(int[][] array, int nr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min && array[i][j] > nr) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static int maxOfArrayGreaterThan(int[][] array, int nr) {
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > min && array[i][j] > nr) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

//    Írj programot, ami megmondja,hogy melyik két város van egymáshoz legközelebb!

    public static void getClosestCities(int[][] array) {
        int min = Integer.MAX_VALUE;
        int city1=0;
        int city2=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min && array[i][j] > 0) {
                    city1=i;
                    city2=j;
                }
            }
        }
        System.out.println("Legközelebbi városok egymáshoz: " + CITIES[city1] + " és "+ CITIES[city2]);
    }
}

