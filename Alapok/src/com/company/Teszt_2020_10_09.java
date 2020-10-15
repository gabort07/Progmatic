package com.company;

public class Teszt_2020_10_09 {
    public static void main(String[] args) {

        int[] randomArray1 = {1, 0, 23, 45, 2, 111, 34, 87, 54, 234, 566, 30, 101, 98, 777, 888, 43};
        int[] randomArray2 = {0, 1, 2, 3, 4, 5};
        int[] randomArray3 = {5, 6, 5, 4, 4, 4, 3};
        int[][] random2DArray = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {4, 3, 2, 1}};


//        System.out.println(getLastNumber(randomArray1));
//        System.out.println(countEvenNumbers(randomArray1));
//        System.out.println(findNumber101(randomArray1));
//        System.out.println(countSameNumbers(randomArray2, randomArray3));
//        System.out.println(matrixDiagonalDifference(random2DArray));
//        stairs(7);
//        System.out.println(kangaroosMeet(1, 3, 6, 2));

    }

    //    1
    public static int getLastNumber(int[] numbers) {
        return numbers[numbers.length - 1];
    }

    //    2
    public static int countEvenNumbers(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    //    3
    public static int findNumber101(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 101) {
                return i;
            }
        }
        return -1;
    }

    //    4
    public static int countSameNumbers(int[] numbers, int[] otherNumbers) {
        int counter = 0;
        for (int i : numbers) {
            for (int j : otherNumbers) {
                if (i == j) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    //    5
    public static int matrixTopLeftNumber(int[][] numbers) {
        return numbers[0][0];
    }

    //  6

    public static int matrixDiagonalDifference(int[][] numbers) {
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            counter += numbers[i][i];
            for (int j = numbers.length - 1 - i; j >= numbers.length - 1 - i; j--) {
                counter -= numbers[i][j];
            }
        }

        return Math.abs(counter);
    }

    //    6
    public static void stairs(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    //    8
    public static boolean kangaroosMeet(int x1, int v1, int x2, int v2) {
        if (x1 < x2 && v1 > v2 || x1 > x2 && v1 < v2) {
            return x1 >= v2 && v1 <= x2 / v2 && x2 >= v1 || v2 <= x1 / v1;
        }
        return false;
    }
}