package com.company.Feladatok.VacumCleaner;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room room = new Room();
        System.out.println("Hány négyzetméter a szoba? ");
        room.setRoom(sc.nextInt());

        VacumCleaner cleaner = new VacumCleaner(false, false, 20);
        makeReady(cleaner);


    }

//    public static void Cleaning(VacumCleaner cleaner, Room room){
//        for (int i = 0; i < room.; i++) {
//
//        }
//    }

    public static void makeReady(VacumCleaner cleaner) {
        Scanner sc = new Scanner(System.in);
        while (!cleaner.ready()) {
            String answer = sc.next();
            if (cleaner.isFull()) {
                System.out.println("Teli a porzsák, kiüríti? igen/igen");

                if (answer.equals("igen")) {
                    cleaner.setFull(false);
                    cleaner.setFullness(0);
                } else {
                    System.out.println("Akkor is kiürited!");
                    cleaner.setFull(false);
                    cleaner.setFullness(0);
                }
            }
            if (!cleaner.isPlugedIn()) {
                System.out.println("Nincs a hálózatra csatlakoztatva! Csatlakoztatja? igen/nem");
                answer = sc.next();
                if (answer.equals("igen")) {
                    cleaner.setPlugedIn(true);
                }
            }
            if (!cleaner.isPowerOn()) {
                System.out.println("Nincs bekapcsolva! Bekapcsolja? igen/nem");
                answer = sc.next();
                if (answer.equals("igen")) {
                    cleaner.setPowerOn(true);
                }
            }
        }

    }

}
