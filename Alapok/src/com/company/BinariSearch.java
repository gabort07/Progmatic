package com.company;

public class BinariSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 9, 10, 15, 20, 20, 111, 112, 115, 300, 350};
        int n = 300;
        System.out.println(getIndexOfN(array, n));
    }

    public static int getIndexOfN(int[] array, int numberToFind) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        int index = -1;

        do {
            if (array[startIndex] == numberToFind) {
                return startIndex;
            } else if (array[endIndex] == numberToFind) {
                return endIndex;
            } else {
                middleIndex = (startIndex + endIndex) / 2;
                if (numberToFind == array[middleIndex]) {
                    return middleIndex;
                } else if (numberToFind > array[middleIndex]) {
                    startIndex = middleIndex;
                } else {
                    endIndex = middleIndex;
                }
            }
        }while (startIndex < endIndex-1);

        return index;
    }
}
