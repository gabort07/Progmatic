package Abstract;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Animal {
    String breed;
    String habitat;
    int age;

    public Animal(String breed, String habitat, int age) {
        this.breed = breed;
        this.habitat = habitat;
        this.age = age;
    }

    public void makeNoise(){};

public static void countType(ArrayList<Animal> zoo){
    int mammalia=0;
    int bird = 0;
    for(Animal animal :zoo){
        if(animal instanceof Mammalia){
            mammalia++;
        } else{
            bird ++;
        }
    }
    System.out.println("Emlősök száma: " +mammalia +"\n" +
            "Madarak száma: "+ bird);
}
public static void catPercentage(ArrayList<Animal> zoo){
    double houseCat = 0;
    double wildCat = 0;
    double sum;
    for(Animal animal : zoo){
        if(animal instanceof HouseCat){
            houseCat++;
        } else {
            wildCat++;
        }
    }
    sum = houseCat + wildCat;
    System.out.println("A házimacskák aránya: " + (houseCat/wildCat)*100 +"%");

}
}
