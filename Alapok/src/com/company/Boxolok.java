package com.company;

import java.util.Arrays;

public class Boxolok {

    public static void main(String[] args) {

        int[] englishBoxers = {73, 64, 81, 54, 82, 73, 62, 91, 83};
        int[] frenchBoxers = {51, 82, 58, 67, 85, 100, 78, 91, 130, 72};
        int[] weightCategories = {52, 57, 63, 71, 79, 91};


        sumOfTheTwoLeightest(englishBoxers, frenchBoxers);
        chooseTheHeaviest(englishBoxers, frenchBoxers);
        countGroupMembers(englishBoxers, frenchBoxers, weightCategories);

    }

    //    Mennyi az angol boxolók átlagos testsúlya?
    public static int makeAverageWeight(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / (array.length);
    }

    //    Hány kg-s a legnehezebb boxoló?
    public static int chooseTheHeaviest(int[] array1, int[] array2) {
        int[] oneArray = new int[array2.length + array2.length];
        oneArray = makeOneArray(array1, array2);
        int max = 0;
        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] > max) {
                max = oneArray[i];
            }
        }
        return max;
    }

    public static int[] makeOneArray(int[] array1, int[] array2) {
        int[] oneArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            oneArray[i] = array1[i];
        }
        for (int i = array1.length; i < oneArray.length; i++) {
            oneArray[i] = array2[i - array1.length];
        }

        return oneArray;
    }

    //    Van két olyan boxoló, akik együtt is könnyebbek mint a legnehezebb boxoló? KIk ők (hány kg-sak)?
    public static void sumOfTheTwoLeightest(int[] array1, int[] array2) {
        int heavy = chooseTheHeaviest(array1, array2);
        int[] oneArray = makeOneArray(array1, array2);
        int counter = 0;

        for (int i = 0; i < oneArray.length; i++) {
            for (int j = i + 1; j < oneArray.length; j++) {
                if (oneArray[i] + oneArray[j] < heavy) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }


    //    Hányan boxolnak az egyes súlycsoportokban?
    public static void countGroupMembers(int[] array1, int[] array2, int[] categories) {
        int[] unitedArray = makeOneArray(array1, array2);

        int[] counter = getMinValueBiggerThan(unitedArray, categories);

        int[][] categoryMembers = new int[categories.length][];
        for (int i = 0; i < categories.length; i++) {
            categoryMembers[i] = new int[counter[i]];
        }

        for (int i = 0; i < categories.length; i++) {
            int index = 0;
            for (int j = 0; j < unitedArray.length; j++) {
                if (unitedArray[j] <= categories[i]) {
                    categoryMembers[i][index] = unitedArray[j];
                    index++;
                }
            }
        }

        for (int i = 0; i < categoryMembers.length; i++) {

            System.out.println(Arrays.toString(categoryMembers[i]));
        }


//        int categori91 = 0;
//        int categori79 = 0;
//        int categori71 = 0;
//        int categori63 = 0;
//        int categori57 = 0;
//        int categori52 = 0;
//        int categori51 = 0;
//
//        for (int i = 0; i < unitedArray.length; i++) {
//            if (unitedArray[i] >= 91) {
//                categoryMembers[6][categori91] = unitedArray[i];
//                categori91++;
//            } else if (unitedArray[i] >= 79) {
//                categoryMembers[5][categori79] = unitedArray[i];
//                categori79++;
//            } else if (unitedArray[i] >= 71) {
//                categoryMembers[4][categori71] = unitedArray[i];
//                categori71++;
//            } else if (unitedArray[i] >= 63) {
//                categoryMembers[3][categori63] = unitedArray[i];
//                categori63++;
//            } else if (unitedArray[i] >= 57) {
//                categoryMembers[2][categori57] = unitedArray[i];
//                categori57++;
//            } else if (unitedArray[i] >= 52) {
//                categoryMembers[1][categori52] = unitedArray[i];
//                categori52++;
//            } else {
//                categoryMembers[0][categori51] = unitedArray[i];
//                categori51++;
//            }
//        }


    }


    //    Feltételes kiválasztás
    public static int[] getMinValueBiggerThan(int[] array, int[] categories) {
        int[] counter = new int[categories.length];
        int nextMin = 0;
        for (int j = 0; j < categories.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= categories[j] && array[i] > nextMin) {
                    counter[j]++;
                    nextMin = categories[j];
                }
            }
        }
        return counter;
    }

    //    Van-e olyan boxoló, aki mérkőzés nélkül is nyerni fog (mert egyedül van a súlycsoportjában)?
    public static void findNLength(int[][] array, int n) {
        for (int i = 0; i < array.length; i++) {

        }

    }

}
