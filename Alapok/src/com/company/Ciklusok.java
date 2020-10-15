package com.company;

public class Ciklusok {
    public static void main(String[] args) {

/*
        int index = 1;
        int j =  1;
        while (index < 101) {
            if (j % 2 == 0){
                System.out.println(index++ +".: " +j);
            }
            j++;
        }
    }

 */
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        int number = 1;
        for (int i = 0; i <= 100; i++) {
            if (number % 7 == 0) {
                System.out.print(number + " ");
            }
            number++;
        }
        System.out.println();
        System.out.println();

        int sum = 0;
        for (int i = 1; i <= 42; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();

        long sum1 = 1;
        for (int i = 1; i <= 20; i++) {
            sum1 *= i;
        }
        System.out.println(sum1);
        System.out.println();

        int sum2 = 0;
        for (int i = 10000; i <= 20000; i++) {
            if (i % 89 == 0 && i % 103 == 0) {
                sum++;
            }
        }
        System.out.println(sum2);
        System.out.println();

        int sum3 = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            sum3 += i;
        }
        System.out.println();
        System.out.println(sum3);

    }
}
