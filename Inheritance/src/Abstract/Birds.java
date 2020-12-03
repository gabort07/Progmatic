package Abstract;

import java.util.ArrayList;

public abstract class Birds extends Animal {

    int wingspan;

    public Birds(String breed, String habitat, int age, int wingspan) {
        super(breed, habitat, age);
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

    public static void averageWingspan(ArrayList<Animal> zoo) {
        int birds = 0;
        double wingspan = 0;
        for(Animal animal : zoo){
            if(animal instanceof Birds){
                wingspan +=((Birds) animal).getWingspan();
                birds++;
            }
        }
        System.out.println("A madarak átlagos szárnyfesztávja: "+ wingspan /birds);
    }
}
