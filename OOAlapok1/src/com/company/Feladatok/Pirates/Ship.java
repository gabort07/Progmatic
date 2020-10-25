//package com.company.Feladatok.Pirates;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Ship {
//    Pirate pirate;
//    List<Pirate> pirates = new ArrayList<>();
//
//    public Ship() {
//
//    }
//
//    public void fillShip() {
//        pirates.add(new Pirate("Captain"));
//        for (int i = 0; i < (Math.random() * 100 + 1); i++) {
//            pirates.add(new Pirate("crew"));
//        }
//    }
//
//    public boolean battle(Ship otherShip) {
//        int piratesOnSThisShip = 0;
//        int piratesOnOtherShip = 0;
//
//        for (int i = 1; i < pirates.size(); i++) {
//            pirates.get(i).brawl(otherShip.pirates.get(1));
//            if (otherShip.pirates.get(0).isDead()) {
//                pi
//                piratesOnSThisShip++;
////            } else if (pirates[i].isDead()) {
//                piratesOnOtherShip++;
//            }
//        }
//
//        if (piratesOnSThisShip > piratesOnOtherShip) {
//            System.out.println("Ez a hajó nyerte a csatát mert " + piratesOnSThisShip + " kalóz maradt élve.");
//        } else {
//            System.out.println("A másik hajó nyerte a csatát mert " + piratesOnOtherShip + " maradt életben.");
//        }
//    }
//}
//}