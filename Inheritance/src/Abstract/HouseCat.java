package Abstract;

public class HouseCat extends Canidea{
    public HouseCat(String breed, String habitat, int age) {
        super(breed, habitat, age);
        super.domesticated = true;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow-Meow");
    }

    @Override
    public String toString() {
        return "HouseCat{" +
                "domesticated=" + domesticated +
                ", breed='" + breed + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                '}';
    }
}
