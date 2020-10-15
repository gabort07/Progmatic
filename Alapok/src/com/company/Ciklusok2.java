package com.company;

public class Ciklusok2 {
    public static void main(String[] args) {

//        int i = 0;
//        do {
//            System.out.println("do while");
//            i++;
//        } while (i <5);

//        for(int i = 0; i <4; i++){
//            for(int j = 0; j < 2; j++){
//                System.out.println(i+ " " + j);
//            }
//        }


//        int i = 0;
//        do {
//            System.out.println("do while");
//            i++;
//        } while (i < 5);
//        int j = 0;
//        while (j < 5) {
//            System.out.println("while");
//            j++;
//        }
//
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println(i + "  " + j);
//            }
//        }
//
//
//        int sum = 0;
//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 == 0 && i % 3 == 0) {
//                sum = sum + i;
//                count++;
//            }
//        }
//        System.out.println(sum / count);
//
//
//        for (int i = 63434; i > 0; i--) {
//            if (63434 % i == 0) {
//                System.out.println(i);
//            }
//        }
//
//
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        for (int j = 1; j < i; j++) {
//            if (i % j == 0 && j % 2 == 0) {
//                System.out.println(j);
//            }
//        }
//
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i + "*" + j + " ");
//            }
//            System.out.println();
//        }
//
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        írj programot ami kap egy számot és annak megfelelően ír ki egy piramist:

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Milyen magas legyen? ");
//        int height = sc.nextInt();
//
//        for (int line = 1; line <= height; line++) {
//            for (int space = height - line - 1; space >= 0; space--) {
//                System.out.print(" ");
//            }
//            for (int worm = 0; worm < line + (line - 1); worm++) {
//                System.out.print("@");
//            }
//            System.out.println();
//        }


//        Írj egy programot, ami kirajzol egy gyémántot így bekért szám alapján:

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Milyen magas legyen? ");
//        int height = 5;
//
//        for (int line = 1; line <= height; line++) { //magasság számoló
//
//                for (int space = height - line - 1; space >= 0; space--) {
//                    System.out.print(" ");
//                }
//            for (int worm = 0; worm < line + (line - 1); worm++) {
//                System.out.print("?");
//            }
//            System.out.println();

//                for (int space = 1; space <= height - line; space++) {
//                    System.out.print(" ");
//                }
//                for (int worm = line + (line - 1); worm >= 1; worm--) {
//                    System.out.print("?");
//                }
//                System.out.println();


    }
}

