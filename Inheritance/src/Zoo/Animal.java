package Zoo;

public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private int fedTimes;

    public Animal(String name) {
        this.name = name;
        this.age = 1;
        this.gender = "unkown";
    }

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected void eat() {
        fedTimes++;
    }

    protected boolean isHungry() {
        return this.fedTimes == 0;
    }

    @Override
    public String toString() {
        return this.name + " is a " + this.age + " years old " + this.gender + " animal and was fed " +
                this.fedTimes + " times";
    }
}
