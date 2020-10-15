package com.company.Feladatok;

public class Ship {
    Pirate[] pirates;

    public Ship() {
        this.pirates = new Pirate[50];
    }

    public void fillShip() {
        for (int i = 0; i < pirates.length; i++) {
            pirates[i] = new Pirate();
        }
    }

    public void battle(Ship otherShip) {
        int piratesOnSThisShip = 0;
        int piratesOnOtherShip = 0;

        for (int i = 0; i < pirates.length; i++) {
            pirates[i].brawl(otherShip.pirates[i]);
            if (otherShip.pirates[i].die) {
                piratesOnSThisShip++;
            } else if (pirates[i].die) {
                piratesOnOtherShip++;
            }
        }

        if (piratesOnSThisShip > piratesOnOtherShip) {
            System.out.println("Ez a hajó nyerte a csatát mert " + piratesOnSThisShip + " kalóz maradt élve.");
        } else {
            System.out.println("A másik hajó nyerte a csatát mert " + piratesOnOtherShip + " maradt életben.");
        }
    }
}
