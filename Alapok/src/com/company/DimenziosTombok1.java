package com.company;

public class DimenziosTombok1 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 20);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + 1 + " tömb:");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        printMaxValueInArray(matrix);
        System.out.println(sumOf2DArray(matrix));
        printDiagonalNumbers(matrix);
    }



    public static void printDiagonalNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
    }

    public static void printMaxValueInArray(int[][] array) {
        int maxValue = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    index = j;
                }
            }
        }
        System.out.println("A legnagyobb elem: " + maxValue + ", indexe: " + index);

    }

    public static int sumOf2DArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

}
