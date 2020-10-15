package com.company;

import java.util.Random;
import java.util.Scanner;

public class Metodusok2 {
    public static void main(String[] args) {

//        divWith7();
//        canDrewTriangle();
//        pitagoras();
//        countDivisors();
//        sumDivisors();
//        isFiboMember();
//        isSiblingPrim();
//        getSumOfDigits();
//        getSumOffNumberWithCube(6, 100);
//        getSumOffDoubleNumberWithCube(6, 100);
//        getPerfectNumber();
//        getPerfectNumberS();


    }

//  Írj metódust, amely eldönti egy bemenetként kapott int számról, hogy az osztható-e 7-tel! divWith7()

    public static void divWith7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a számot! ");
        System.out.println("Osztható 7-tel? " + (isDiv7(sc.nextInt()) ? "Igen" : "Nem"));
    }

    public static boolean isDiv7(int n) {
        return n % 7 == 0;
    }

//    Írj egy metódust, amely eldöntinhárom(nem feltétlen egész) számról,hogy lehet-e ilyen hosszú szakaszokból háromszöget szerkeszteni! canDrewTriangle()

    public static void canDrewTriangle() {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("A oldal: ");
        a = sc.nextDouble();
        System.out.println("B oldal: ");
        b = sc.nextDouble();
        System.out.println("C oldal: ");
        c = sc.nextDouble();

        System.out.println("Lehet ezekből háromszöget szerkeszteni? " + (canDrawTriangle(a, b, c) ? "Igen" : "Nem"));
    }

    public static boolean canDrawTriangle(double a, double b, double c) {
        return a + b > c || a + c > b || b + c > a;
    }

//    Írj metódust, ami a két befogó hosszát paraméterül adva kiszámolja, hogy mennyi a derékszögű háromszög átfogója! pitagoras()

    public static void pitagoras() {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Egyik oldal? ");
        a = sc.nextDouble();
        System.out.println("Másik oldal? ");
        b = sc.nextDouble();

        System.out.println("A háromszög átfogója: " + rightAngleTriangle(a, b));
    }

    public static double rightAngleTriangle(double a, double b) {
        return Math.sqrt((a * a) + (b * b));
    }

//    Írj egy metódust, amely megszámolja, hogy egy bemenetül kapott int számnak hány osztója van! countDivisors()

    public static void countDivisors() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot! ");
        int a = sc.nextInt();
        System.out.println(countDivisors(a) + " osztója van.");
    }

    public static int countDivisors(int n) {
        int sum = 0;
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                sum++;
            }
        }
        return sum;
    }

//    Írj metódust, amely visszaadja egy szám nála kisebb osztóinak összegét! sumDivisors()

    public static void sumDivisors() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot ");
        int a = sc.nextInt();
        System.out.println("Osztóinak összege: " + sumDivisors(a));
    }

    public static int sumDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

//    Írj egy metódust, mely egy számról eldönti, hogy eleme-e a Fibonacci-sorozatnak! isFiboMember()

    public static void isFiboMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot");
        System.out.println(isFiboMember(sc.nextInt()) ? "Igen tagja a fiboncci sorozatnak" : "Nem tagja a fiboncci sorozatnak");
    }

    public static boolean isFiboMember(int a) {

        int n1 = 1;
        int n2 = 1;
        int fibNumber = 1;
        do {
            if (fibNumber == a) {
                return true;
            }
            fibNumber = n1 + n2;
            n1 = n2;
            n2 = fibNumber;
        } while (fibNumber <= a);
        System.out.println();
        return false;
    }

//    Írj metódust, amely két bemeneti számról eldönti, hogy azok ikerprímek-e. isSiblingPrim()


    public static void isSiblingPrim() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az egyik számot! ");
        int a = sc.nextInt();
        System.out.println("Kérema a másik számot! ");
        int b = sc.nextInt();
        System.out.println(isSiblingPrim(a, b) ? "Igen, + ikerprimek." : "Nem" + " ikerprimek.");
    }

    public static boolean isSiblingPrim(int a, int b) {
        if (isPrim(a) && isPrim(b)) {
            if (a - b == 2 || b - a == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPrim(int input) {
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

//    Írj egy metódust, amely visszaadja egy bemenetül kapott egész szám számjegyeinek az összegét! getSumOfDigits()

    public static void getSumOfDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot aminek a számjegyeit összeadom! ");
        int a = sc.nextInt();
        System.out.println("A számjegyek összege: " + sumOfDigits(a));
    }


    public static int sumOfDigits(int input) {
        int sum = 0;
        String a = "" + input;
        for (int i = 0; i < a.length(); i++) {
            sum += Integer.parseInt(a.valueOf(a.charAt(i)));
        }
        return sum;
    }

//     Írj egy metódust, amely szimulál 100 kockadobást, és megszámolja, hogy hány 6-ost sikerült eközben dobni. throwSixWithCube()

    public static void getSumOffNumberWithCube(int number, int experiment) {
        System.out.println(experiment + " szimulált dobásból " + sumOfNumberThrownWithCube(number, experiment)
                + " lett " + number + "-os.");
    }

    public static int sumOfNumberThrownWithCube(int number, int experiment) {
        int sumOfNumber = 0;
        for (int i = 1; i <= experiment; i++) {
            if (throwWithCube() == number) {
                sumOfNumber++;
            }
        }
        return sumOfNumber;
    }

    public static int throwWithCube() {
        Random ran = new Random();
        return ran.nextInt(6) + 1;
    }

//    10.  Írj egy metódust, amely szimulál 100 kockadobást, és megszámolja, hogy hányszor sikerült két 6-ost dobni egymás után. sumOffDoubleSix()

    public static void getSumOffDoubleNumberWithCube(int number, int experiment) {
        System.out.println(experiment + " dobásból " + sumOffDoubleNumberWithCube(number, experiment) + " lett dupla " + number);
    }

    public static int sumOffDoubleNumberWithCube(int number, int experiment) {
        int throw1 = 0;
        int throw2 = 0;
        int doubleNumber = 0;
        for (int i = 1; i <= experiment; i++) {

            throw1 = throwWithCube();
            i++;
            throw2 = throwWithCube();
            if (throw2 == number) {
                throw1 = throw2;
                throw2 = throwWithCube();
                i++;
            }
            if (throw1 == number && throw2 == number) {
                doubleNumber++;
                throw1 = 0;
                throw2 = 0;
            }
        }
        return doubleNumber;
    }

//    A számelméletben tökéletes számnak nevezzük azokat a természetes számokat, amelyek megegyeznek az önmaguknál
//    kisebb osztóik összegével. Pl. tökéletes szám a 6, mert önmagánál kisebb osztói: 1, 2, 3 és 1+2+3=6.
// Írj metódust, ami egy számról eldönti, hogy tökéletes szám-e!

    public static void getPerfectNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek egy számot a vizsgálathoz! ");
        int number = sc.nextInt();
        System.out.println(isPerfectNumber(number) ? number + " egy tökéletes szám" : number + " nem egy tökéletes szám");
    }

    public static boolean isPerfectNumber(int a) {
        int[] dividers = new int[a / 2];
        int sum = 0;
        for (int i = 1; i <= dividers.length; i++) {
            if (a % i == 0) {
                dividers[i - 1] += i;
            }
        }
        for (int i = 0; i < dividers.length; i++) {
            sum += dividers[i];
        }
        return sum == a;
    }

//    13.  Írj metódust, ami megszámolja, hogy 1 és 1000 között hány tökéletes szám van!

    public static void getPerfectNumberS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az ellenőrzés felső határat! ");
        int a = sc.nextInt();
        System.out.println("1 és " + a + " között " + perfectNumberCounter(a) + " tökéletes szám van.");
    }

    public static int perfectNumberCounter(int input) {
        int coubnter = 0;
        for (int i = 1; i <= input; i++) {
            if (isPerfectNumber(i)) {
                coubnter++;
            }
        }
        return coubnter;
    }


}