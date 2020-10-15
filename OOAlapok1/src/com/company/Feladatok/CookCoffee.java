package com.company.Feladatok;

public class CookCoffee {

    public static void main(String[] args) {
        CoffeeMachine coffee = new CoffeeMachine();
        if (coffee.checkList()) {
            coffee.makeCoffee();
        } else {
            while (!coffee.checkList()) {
                coffee.fillMachine();
            }
            coffee.makeCoffee();
        }
    }
}
