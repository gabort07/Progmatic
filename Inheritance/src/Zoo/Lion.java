package Zoo;

public class Lion extends Animal{

    public Lion(String name) {
        super(name);
    }

    public Lion(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected boolean isHungry() {
        return true;
    }
}
