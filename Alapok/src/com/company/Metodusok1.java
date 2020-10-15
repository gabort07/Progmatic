package com.company;

public class Metodusok1 {

    public static void main(String[] args) {

        System.out.println(printPrimSumm(10000000));

    }

    //    Ha az a feladatod, hogy írj metódust, ami visszaadja két egész szám közül a kisebbet, akkor milyen szignatúrával látnád el ezt a metódust? Írd le!
    public static long printSmallerNumber(long nr1, long nr2) {
        if (nr1 < nr2) {
            return nr1;
        } else
            return nr2;
    }

    //    Lehetne metódust írni arra a feladatra is, hogy adjuk össze az első n prím számot? Ennek mi lenne a szignatúrája? Milyen viszonyban állhatna az isPrime metódussal?
    public static long  printPrimSumm(long input) {
        long sum = 0;
        long i = 1;
        int counter = 1;

        while (counter <= input) {
            if (isPrim(i)) {
                sum += i;
                counter++;
            }
            i++;
        }
        return sum;
    }

    public static boolean isPrim(long input) {
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}

