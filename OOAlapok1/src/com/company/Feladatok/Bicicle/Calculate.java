package com.company.Feladatok.Bicicle;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Bicicle bicicle = new Bicicle(0.66, 40, new int[]{28, 26, 24, 22, 20, 18, 16, 14});
        Scanner sc = new Scanner(System.in);
        System.out.println("Üdvözöli a kalkulátor! Mit szeretne számolni?");
        System.out.println("'a' -> Sebesség");
        System.out.println("'b' -> Fordulatszám");
        String answer = sc.next();

        if (answer.equals("a")) {
            System.out.println("Melyik fokozatban van a váltó?");
            bicicle.setShift(sc.nextInt());
            System.out.println("Hányszor tekeri meg a pedált egy másodperc alatt?");
            bicicle.setRps(sc.nextDouble());
            System.out.println("A kerékpár sebessége: " + bicicle.getSpeed(bicicle.getRps()) + " m/s");
        } else if (answer.equals("b")) {
            System.out.println("Melyik fokozatban van a váltó?");
            bicicle.setShift(sc.nextInt());
            System.out.println("Mekkora a kerékpár sebessége km/h -ban?");
            bicicle.setSpeed(sc.nextDouble()/3.6);
            System.out.println("A pedál fordulatszáma: " + bicicle.getRps(bicicle.getSpeed()) + " fordulat/s");
        } else {
            System.out.println("Nincs ilyen lehetőség!");
        }


    }
}
