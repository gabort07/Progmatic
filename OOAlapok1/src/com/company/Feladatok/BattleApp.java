package com.company.Feladatok;

public class BattleApp {
    public static void main(String[] args) {
        Ship shipOne = new Ship();
        shipOne.fillShip();
        Ship enemyShip = new Ship();
        enemyShip.fillShip();

        shipOne.battle(enemyShip);
    }
}