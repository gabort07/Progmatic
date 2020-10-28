package company.Person;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = (int) (Math.random() * 70 + 1);
        this.height = (int) (Math.random() * 210 + 110);
        this.weight = (int) (Math.random() * 210 + 60);
    }

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

}
