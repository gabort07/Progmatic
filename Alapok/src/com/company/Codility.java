package com.company;

public class Codility {
    public static void main(String[] args) {
//        int[] A = new int[4];
//        A[0] = 2;
//        A[1] = 3;
//        A[2] = 1;
//        A[3] = 5;
//
//        int aSum= 0;
//        for (int i = 0; i < A.length; i++) {
//            aSum += A[i];
//        }
//        for(int i = 1; i<=A.length+1; i++) {
//            aSum -= i;
//        }

//        System.out.println(Math.abs(aSum));
//        System.out.println(minDifference());


    }

    public static int minDifference() {

        int[] A = {3, 1, 2, 4, 3};
        int sumOfArray = 0;
        for (int i : A) {
            sumOfArray += i;
        }

        int minValue = Integer.MAX_VALUE;
        int sumOfAside = 0;

        for (int p = 1; p < A.length; p++) {
            int innerTemp = 0;
            sumOfAside += A[p - 1];
            innerTemp = Math.abs(sumOfAside - (sumOfArray - sumOfAside));
            if (innerTemp < minValue) {
                minValue = innerTemp;
            }
        }
        return minValue;
    }


    //    FrogRiverOne
//    public int solution(int X, int[] A) {
//        int index = 0;
//        for (int i = 0; i < A.length; i++) {
//
//        }
//
//    }


}