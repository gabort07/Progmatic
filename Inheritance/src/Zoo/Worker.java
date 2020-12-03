package Zoo;

import java.util.ArrayList;

public class Worker {
    private String name;
    ArrayList<Animal> animalsToLookAfter;

    public Worker(String name, ArrayList<Animal> animalsToLookAfter) {
        this.name = name;
        this.animalsToLookAfter = animalsToLookAfter;
    }

    public Worker(String name) {
        this.name = name;
        this.animalsToLookAfter = new ArrayList<>();
    }

    protected void doDailyRoutine(){
        for(Animal animal :animalsToLookAfter){
            if(animal.isHungry()){
                animal.eat();
            }
        }
    }
}
