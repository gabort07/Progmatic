package com.company.Feladatok;

import java.util.Scanner;

public class CoffeeMachine {
    private int waterLevel;
    private int coffeeLevel;
    private boolean newFilter;


    public void makeCoffee() {
        if (getCoffeeLevel() == getWaterLevel()) {
            System.out.println("Máris kész egy ideális erősségű kávé!");
        } else if( getCoffeeLevel()< getWaterLevel()) {
            System.out.println("Máris kész egy gyenge kávé!");
        } else {
            System.out.println("Máris kész egy erős kávé!");
        }
        setCoffeeLevel(0);
        setWaterLevel(0);
        setFilter(false);
    }

    public void fillMachine() {
        Scanner sc = new Scanner(System.in);
        if (getWaterLevel() == 0) {
            System.out.println("Üres a víztartály! Hány dl vizet adjunk hozzá?");
            setWaterLevel(sc.nextInt());
        }
        if (getCoffeeLevel() == 0) {
            System.out.println("Nincs káve a gépben! Hány kanál kávét adjunk hozzá?");
            setCoffeeLevel(sc.nextInt());
        }
        if (!isNewFilter()) {
            System.out.println("Ki kell cserélni a filtért! Csere? (igen/nem)");
            String x = sc.next();
            if (x.equals("igen")) {
                changeFilter();
            } else {
                System.out.println("Akkor is kicseréljü!");
                changeFilter();
            }
        }
    }

    public boolean checkList() {
        return waterLevel > 0 && coffeeLevel > 0 && newFilter;
    }

    public void addWater(int dl) {
        this.waterLevel += dl;
    }

    public void addCoffee(int spoon) {
        this.coffeeLevel += spoon;
    }

    public void changeFilter() {
        this.newFilter = true;
    }

    public CoffeeMachine() {
        this.waterLevel = 0;
        this.coffeeLevel = 0;
        this.newFilter = false;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public void setCoffeeLevel(int coffeLevel) {
        this.coffeeLevel = coffeLevel;
    }

    public void setFilter(boolean filter) {
        this.newFilter = filter;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getCoffeeLevel() {
        return coffeeLevel;
    }

    public boolean isNewFilter() {
        return newFilter;
    }
}
