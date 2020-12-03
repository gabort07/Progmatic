package Abstract;

public class Parrot extends Birds {
    public Parrot(String breed, String habitat, int age, int wingspan) {
        super(breed, habitat, age, wingspan);
    }

    @Override
    public void makeNoise() {
        System.out.println("Pityu vagyok");
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "wingspan=" + wingspan +
                ", breed='" + breed + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                '}';
    }
}
