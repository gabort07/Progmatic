package company.Comparatorok.Pub;

import java.util.*;

public class Guest {
    private final int name;
    private final String favoriteDrink;
    private final boolean drinkEls;
    private double timeToSpend;
    private boolean thirsty;
    private double alcoholLevel;
    private List<String> drinkToChoose;
    

    public Guest(int name, Set<String> drinks) {
        this.drinkToChoose = new ArrayList<>(drinks);
        this.name = name;
        this.favoriteDrink = chooseRandomDrink();
        this.drinkEls = ((int) (Math.random() * 2 + 1) == 1);
        this.timeToSpend = ((int)(Math.random()*32+1)) / 2.0;
        this.alcoholLevel=0;
        this.thirsty = true;

    }

    public void setTimeToSpend(double timeToSpend) {
        this.timeToSpend = timeToSpend;
    }

    public void setThirsty() {
        this.thirsty =  ((int) (Math.random() * 2 + 1) == 1);
    }

    public void incriseAlcoholLevel(double alcoholLevel) {
        this.alcoholLevel += alcoholLevel;
    }

    public int getName() {
        return name;
    }

    public String getFavoriteDrink() {
        return favoriteDrink;
    }

    public boolean drinkEls() {
        return drinkEls;
    }

    public double getTimeToSpend() {
        return timeToSpend;
    }

    public boolean isThirsty() {
        return thirsty;
    }

    public double getAlcoholLevel() {
        return alcoholLevel;
    }

    public  String chooseRandomDrink() {
        int drink = (int) (Math.random() * drinkToChoose.size());
        return drinkToChoose.get(drink);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name=" + name +
                ", favoriteDrink='" + favoriteDrink + '\'' +
                ", drinkEls=" + drinkEls +
                ", timeToSpend=" + timeToSpend +
                ", thirsty=" + thirsty +
                ", alcoholLevel=" + alcoholLevel +
                '}';
    }
}
