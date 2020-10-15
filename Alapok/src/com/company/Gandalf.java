package com.company;

import java.util.Arrays;

public class Gandalf {
    public static void main(String[] args) {
        int[] mountains = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};
        int[] membersWeight = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};
        int[][] membersWeightAndHeight = {{84, 144}, {83, 130}, {82, 138}, {76, 135}, {61, 128}, {70, 130}, {58, 120},
                {67, 125}, {72, 130}, {85, 110}};

        System.out.println("A legmagasabb hegy: " + getMax(mountains));

//        organize(mountains);
        System.out.println("Átjutáshoz szükséges ideő: " + timeOfPassOver(membersWeight));


        getArray(mountains);

        tower(membersWeightAndHeight);

    }

    public static void getArray(int[] array) {
        System.out.print("A tömb elemei:");
        for (int a : array) {
            System.out.print(" " + a);
        }
        System.out.println();
    }

    public static void getArray(int[][] array) {
        System.out.println("A tömb elemei:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(Arrays.toString(array[i]));
        }
        System.out.println();
    }

    public static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                array[i] = min;
            }
        }
        return min;
    }




    public static int getIndexOfMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int getIndexOfMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

//    Írj metódust, ami válaszol Gandalf kérdésére, vagyis egy tömb minden elemét
//    lecseréli a tőle jobbra lévő elemek (és saját maga) közül a legnagyobbra.

    public static void organize(int[] array) {
        int max = getMax(array);
        int maxIndex = getIndexOfMax(array);
        for (int i = 0; i < maxIndex; i++) {
            array[i] = max;
        }
    }

//    súly szerint sorba állnak és először a
//legkönnyebb és a legnehezebb megy át, utána a második legkönnyebb és a második
//legnehezebb és így tovább. Ha valamelyik pár nehezebb 150 kg-nál, akkor ők egyesével
//mennek át. Egy személy ill. egy pár 5 perc alatt kel át a hídon. Mennyi ideig tartott a teljes
//átkelés?

    public static int timeOfPassOver(int[] array) {

        int time = 0;
        int walkOver = 5;
        int maxWeight = 150;

        int[] minMaxArray = Tombok2.organizeToAscendantArray(array);
//        getArray(minMaxArray);
        int[] maxMinArray = Tombok2.organizeToDescendingArray(array);
//        getArray(maxMinArray);

        for (int i = 0; i < minMaxArray.length; i++) {
            if (minMaxArray[i] + maxMinArray[i] <= maxWeight) {
                time += 5;
            } else {
                time += 10;
            }
        }
        return time / 2;
    }

//    Írj metódus, ami ismerve az egyes személyek súlyát és magasságát, megadja, hogy
//mi az a legmagasabb torony, amit ezek a személyek alkothatnak, ha egymás vállára
//állnak, feltéve hogy valakinek a vállára csak olyan valaki állhat, aki alacsonyabb is és
//könnyebb is nála!
//A törpök (és Gandalf) súlya és magassága az alábbiak: (a első szám a súly, a második
//a magasság)

    public static void tower(int[][] array) {
        int[][] orderedByWeight = orderedByWeightAscendant(array);
        int[][] orderedByHeight = orderedByHeightAscendant(array);
        int towerHeight = 0;
        int maxWeight = 0;
        int indexOfMaxWeight = 0;

        getArray(orderedByWeight);
        getArray(orderedByHeight);


    }

    public static int[][] orderedByWeightAscendant(int[][] input) {
        int temp;
        for (int j = 0; j < input.length; j++) {
            for (int i = 0; i < input.length - j - 1; i++) {
                if (input[i][0] < input[i + 1][0]) {
                    temp = input[i + 1][0];
                    input[i + 1][0] = input[i][0];
                    input[i][0] = temp;
                }
            }
        }
        return input;
    }

    public static int[][] orderedByHeightAscendant(int[][] input) {
        int temp;
        int[][] array = input;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i][1] < array[i + 1][1]) {
                    temp = array[i + 1][1];
                    array[i + 1][0] = array[i][0];
                    array[i][1] = temp;
                }
            }
        }
        return array;
    }
}