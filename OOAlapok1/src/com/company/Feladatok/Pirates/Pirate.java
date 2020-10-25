package com.company.Feladatok.Pirates;

public class Pirate {
        private String rank;
        private int poisonLevel;
        private boolean die = false;

        public Pirate(String rank){
            this.rank = rank;
        }

    public boolean isDead() {
        return die;
    }

    public void drinkSomeRum() {
            if (die) {
                System.out.println("He's dead!");
            } else
                poisonLevel++;
        }

        public void howsItGoingMate() {
            if (die) {
                System.out.println("he's dead!");
            } else if (this.poisonLevel <= 4) {
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
                    poisonLevel = 0;
                }
            }
        }


}
