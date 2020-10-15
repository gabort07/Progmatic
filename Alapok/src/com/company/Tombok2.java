package com.company;

public class Tombok2 {

    public static void main(String[] args) {

        int[] myRandomArray = Tombok1.makeRandomArray(10, 100);

//        getArray(myRandomArray);
//        System.out.println(minOfArrayGreaterThan(myRandomArray, 45));
//        getArray(bubbleSortArray(myRandomArray));

        orderArrayBySelectionSort2(myRandomArray);
        getArray(myRandomArray);

    }

    public static void orderArrayBySelectionSort2(int[] array) {
        int index = 0;
        int temp = 0;

        while (index < array.length) {

            int minIndexOfArray = minIndexOfArrayPart(array, index); // a legkissebb szám indexe

            if (array[index] != array[minIndexOfArray]) {
                temp = array[index];
                array[index] = array[minIndexOfArray];
                array[minIndexOfArray] = temp;
            }
            index++;
        }
    }

    public static int minIndexOfArrayPart(int[] array, int from) {
        int minIndex = from;
        for (int i = from; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static int[] bubbleSortArray(int[] input) {
        int temp;
        int[] array = input;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public static int[] organizeToAscendantArray(int[] array) {
        int[] organizedArray = new int[array.length];
        organizedArray[0] = minOfArray(array);

        for (int i = 1; i < organizedArray.length; i++) {
            organizedArray[i] = minOfArrayGreaterThan(array, organizedArray[i - 1]);
        }
        return organizedArray;
    }

    public static int[] organizeToDescendingArray(int[] array) {
        int[] organizedArray = new int[array.length];
        organizedArray[0] = getMaxValueInArray(array);

        for (int i = 1; i < organizedArray.length; i++) {
            organizedArray[i] = maxOfArraySmallerThan(array, organizedArray[i - 1]);
        }
        return organizedArray;
    }

    /**
     * Find the minimum of nums witch is greater then nr
     *
     * @param nums the array in witch  we search for a minimum
     * @param nr   the returned value must be greater tha this num
     * @return the minimum values of those values that are greater than nr
     */
    public static int minOfArrayGreaterThan(int[] nums, int nr) {
        if (nums.length == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min && num > nr) {
                min = num;
            }
        }
        return min;
    }

    public static int maxOfArraySmallerThan(int[] nums, int nr) {
        if (nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max && num < nr) {
                max = num;
            }
        }
        return max;
    }

    public static int minOfArray(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ". elem: " + array[i]);
        }
    }

//    Deklarálj egy 10 hosszú tömböt, majd töltsd fel az elemeit az első 10 természetes számmal!

//    public static int[] makeNormalArray(int size) {
//        for (int i = 0; i < size; i++) {
//
//        }
//    }

    public static int getMaxValueInArray(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;

    }

    public static int[] firstNPrime(int n) {
        int[] array = new int[n];
        int j = 0;
        for (int i = 2; i < array.length; i++) {
            if (Metodusok2.isPrim(i)) {
                array[j] = i;
                j++;
            }
        }
        return array;

    }
}