package com.company;

import java.util.Random;

public class Metodusok3 {
    public static void main(String[] args) {

//        pepysProblem(1000);
//        getNumberOfSpoons(40,5);
//        eating();

    }

//    Írj programot, ami szimulációval válaszolja meg Pepys kérdését,
//    hogy 6 kockadobás között lesz legalább egy egyes, vagy az, hogy 12 kockadobás közűl lesz legalább két egyes.

    public static void pepysProblem(int experiment) {
        int countOne = 0;
        int countDoubleOne = 0;

        for (int i = 1; i <= experiment; i++) {
            if (Metodusok2.sumOfNumberThrownWithCube(1, 6) > 1) {
                countOne++;
            }
            if (Metodusok2.sumOffDoubleNumberWithCube(1, 12) > 1) {
                countDoubleOne++;
            }
        }
        System.out.println(experiment + " kísérletből:");
        System.out.println("6 kockadobásból " + countOne + " lett 1 -es");
        System.out.println("12 kockadobásból " + countDoubleOne + " lett dupla 1-es");
    }

//    Tortát akarsz sütni, és a recept azt írja, hogy mérj ki 40 dkg lisztet.
//    Egy tálad, egy kanalad, és egy mérleged van. A kanálra egy merítésre 1 és 5 dkg közötti liszt kerül.
//    Hogy pontosan mennyi, az véletlenszerű (nem tudod szabályozni). Addig rakosgatod a lisztet a tálba,
//    amíg el nem éred a 40 dkg-t. Ha túlhaladod, akkor kivszel egy kanállal. Mindezt addig folytatod,
//    amíg a mérleg 39.5 és 40.5 közötti értéket nem jelez

    public static void getNumberOfSpoons(int fluorNeed, int weightOfTheSpoon) {
        System.out.println(fluorNeed + "dkg liszthez kb. " + fluorGauging(fluorNeed, weightOfTheSpoon) +
                " random kanalazásra lesz szükség.");
    }

    public static int fluorGauging(int need, int spoon) {
        double min = need - 0.5;
        double max = need + 0.5;
        int numberOfSpoons = 0;
        double actualWeight = 0;

        do {
            actualWeight += spooning(spoon);
            numberOfSpoons++;
        } while (actualWeight < need);

        while (actualWeight <= 39.5 && actualWeight >= 40.5) {
            if (actualWeight > 40.5) {
                actualWeight -= spooning(spoon);
                numberOfSpoons++;
            }
            if (actualWeight < 39.5) {
                actualWeight += spooning(spoon);
                numberOfSpoons++;
            }
        }
        return numberOfSpoons;
    }

    public static int spooning(int maxWeight) {
        Random weight = new Random();
        return weight.nextInt(maxWeight) + 1;

    }

//    2.     A fentihez hasonlóan írjunk evés-szimulátort!
//    Egy tálban különféle falatok vannak, összesen n db falat (n egy 10 és 30 közti random szám).
//    Úgy eszünk, hogy kiveszünk a tálból egy falatot, majd rágni kezdjük. Minden egyes rágással az étel sűrűsége
//    egy 0 és 1 közötti random értékkel csökken. A falat eredeti sűrüsége egy 3 és 8 közötti véletlen szám.
//    Ha a rágott étel sűrüsége egy alá csökken, lenyeljük. A telítettség érzetünk ilyenkor egy 0 és 1 közötti számmal nő.
//    Ha a teltség érzésünk nem érte el a 15-öt és a tálban van még falat, akkor egy újabb falatot veszünk,
//    és az előbb ismertetett módon rágni kezdjük. És így tovább. Valahányszor lenyelünk egy falatot, a szimulátor írja ki,
//    hogy hányat rágtunk ratja, hogy mennyi a teltség érzetünk, és hány falat van még a tálban! Ha a végén teli leszünk,
//    írjuk ki, hogy "Hmm, ez jól esett". Ha viszont a végén elfogyott az étel, írjuk ki, hogy “Ez elfogyott,
//    pedig tudnék még enni”.

    public static void eating() {
        int numberOfSnacks = numberOfSnacks();
        double snackDensity;
        int numberOfChaws = 0;
        double amIFull = 0;
        double full = 15;

        do { //(numberOfSnacks > 0 || amIFull < full)
            numberOfSnacks--;
            snackDensity = snackDensity();

            while (snackDensity >= 1) {
                snackDensity -= Math.random();
                numberOfChaws++;
            }

            amIFull += Math.random();
            System.out.println("Rágások száma: " + numberOfChaws);
            System.out.println("Teltség érzet: " + amIFull);
            System.out.println("maradék falatok: " + numberOfSnacks);
            numberOfChaws = 0;

            if (amIFull >= full && numberOfSnacks > 0) {
                System.out.println("Hmm, ez jól esett");
                break;
            } else if (numberOfSnacks <= 0 && amIFull < full) {
                System.out.println("Ez elfogyott, pedig tudnék még enni");
                break;
            }

        } while (numberOfSnacks > 0 || amIFull < full);




    }

    public static int snackDensity() {
        Random dens = new Random();
        return dens.nextInt(5) + 3;
    }

    public static int numberOfSnacks() {
        Random random = new Random();
        int snacks = 0;
        do {
            snacks = random.nextInt(31);
        } while (snacks < 10);
        return snacks;
    }

}
