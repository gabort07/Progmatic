package com.company.Feladatok;

public class Pirate {
    int poisoning = 0;
    boolean die = false;

    public void drinkSomeRum() {
        if (die) {
            System.out.println("He's dead!");
        } else
            poisoning++;
    }

    public void howsItGoingMate() {
        if (die) {
            System.out.println("he's dead!");
        } else if (this.poisoning <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void die() {
        die = true;
    }

    public void brawl(Pirate pirate) {
        if (!this.die) {
            int fortune = (int) (Math.random() * 3 + 1);

            if (fortune == 1) {
                System.out.println("Killed the other pirate!");
                pirate.die();
            } else if (fortune == 2) {
                System.out.println("He is dead");
                this.die();
            } else {
                System.out.println("They felt asleep!");
            }
        }
    }
}
