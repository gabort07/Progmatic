package Zoo;

public class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    public Monkey(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected boolean isHungry() {
        return Math.random()>0.5;
    }
}
