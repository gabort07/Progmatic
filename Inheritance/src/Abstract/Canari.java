package Abstract;

public class Canari extends Birds {
    public Canari(String breed, String habitat, int age, int wingspan) {
        super(breed, habitat, age, wingspan);
    }

    @Override
    public void makeNoise() {
        System.out.println("Csip-Csip");
    }

    @Override
    public String toString() {
        return "Canari{" +
                "wingspan=" + wingspan +
                ", breed='" + breed + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                '}';
    }
}
