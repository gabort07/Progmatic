package Abstract;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();


        HouseCat maffia = new HouseCat("House-cat", "Human-area", 3);
        zoo.add(maffia);
        WildCat leopard = new WildCat("Leopard", "Savanna", 5);
        zoo.add(leopard);
        WildCat tiger = new WildCat("Tiger", "Rainforest", 8);
        zoo.add(tiger);
        WildCat lion = new WildCat("Lion", "Savanna", 3);
        zoo.add(lion);
        Dog rex = new Dog("German-shepperd", "Human-area", 6);
        zoo.add(rex);
        Dog cesar = new Dog("Rotveiler", "Human-area", 2);
        zoo.add(cesar);
        Dog csepi = new Dog("Sausage-dog", "Human-area", 4);
        zoo.add(csepi);
        Parrot pityu = new Parrot("Cuban-Macaw","Tropicalrainforest", 2,110);
        zoo.add(pityu);
        Canari csorike = new Canari("House-Canari","Bird Cage",4,20);
        zoo.add(csorike);


        System.out.println(zoo.toString());

        for(Animal animal : zoo){
            animal.makeNoise();
        }
        System.out.println();

        Animal.countType(zoo);

        Animal.catPercentage(zoo);

        Birds.averageWingspan(zoo);

        for(Animal animal : zoo){
            if(animal instanceof Dog){
                ((Dog) animal).letsPlay();
            }
        }
    }
}
