package com.company;

public class Tombok1 {
    public static void main(String[] args) {

        int[] myArray = makeRandomArray(100, 1000);

        System.out.println("mennyi a tömbben szereplő páros számok összege? " + getSumOfEvenRandom(myArray));

        System.out.println("mennyi a tömbben szereplő páros számok átlaga? " + getAverageOfEvens(myArray));

        System.out.println("hányszor fordul elő olyan a tömbben, hogy egy páratlan számot egy páros követ? " + countEvenFollowOdd(myArray));

        System.out.println("mennyi a tömbben szereplő legnagyobb érték? " + getMaxValueInArray(myArray));

        System.out.println("melyik a tömbben szereplő első prímszám? " + getFirstPrim(myArray));

        System.out.println("hány prímszám található a tömbben? " + getCountOfPrims(myArray));

        printArray(myArray);

        printArrayBackwards(myArray);


    }

//    1. Hozz létre egy 100 elemű tömböt, és a következő feladatok megoldása során ezt használd! (A tömbök elemeit 0-1000-ig véletlen számokkal töltsd fel!)

    public static int[] makeRandomArray(int size, int limes) {
        int[] random = new int[size];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * limes + 1);

        }
        return random;
    }

//    2. Írj egy metódust amely meghatározza, hogy mennyi a tömbben szereplő páros számok összege!

    public static int getSumOfEvenRandom(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

//    3. Írj egy metódust amely meghatározza, hogy mennyi a tömbben szereplő páros számok átlaga!

    public static int getAverageOfEvens(int[] array) {
        return getSumOfEvenRandom(array) / getCountOfEvens(array);
    }

    public static int getCountOfEvens(int[] array) {
        int evenCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCounter++;
            }
        }
        return evenCounter;
    }

//    4. Írj egy metódust amely meghatározza, hogy hányszor fordul elő olyan a tömbben, hogy egy páratlan számot egy páros követ!

    public static int countEvenFollowOdd(int[] array) {
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] % 2 != 0 && array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

//    5. Írj egy metódust, amely meghatározza, hogy mennyi a tömbben szereplő legnagyobb érték!

    public static int getMaxValueInArray(int[] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

//    6. Írj egy metódust, amely meghatározza, hogy melyik a tömbben szereplő első prímszám!

    public static int getFirstPrim(int[] array) {
        int firPrim = 0;
        for (int i = 0; i < array.length; i++) {
            if (Metodusok2.isPrim(array[i])) {
                firPrim = array[i];
                break;
            }
        }
        return firPrim;
    }

//    7. Írj egy metódust, amely meghatározza, hogy hány prímszám található a tömbben!

    public static int getCountOfPrims(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (Metodusok2.isPrim(array[i])) {
                counter++;
            }
        }
        return counter;
    }

//    8. Írj egy printArray() metódust, amely kiírja a kapott tömb elemeit egymás alá a konzolra!

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ". elem: " + array[i]);
        }
    }

    public static void printArrayBackwards(int[] array){
        for (int i = array.length-1; i>=0; i--){
            System.out.println(i+". elem: "+ array[i] );
        }
    }

}
