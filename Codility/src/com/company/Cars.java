package com.company;

public class Cars {

    public static void main(String[] args) {
        int[] nullOneArray = {0, 1, 0, 1, 1};
        System.out.println(countPairsOfCars(nullOneArray));

    }

    public static int countPairsOfCars(int[] A) {
        int counter = 0;
        int ones = 0;
        for (int i : A) {
            if (i == 1) {
                ones++;
            }
        }
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            if (counter > 1000000000){
                return -1;
            }
            if (A[i] == 1) {
                temp++;
            } else if (A[i] == 0) {
                counter += ones - temp;
            }
        }
        return counter;
    }

}
