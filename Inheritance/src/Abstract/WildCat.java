package Abstract;

public class WildCat extends Canidea {

    public WildCat(String breed, String habitat, int age) {
        super(breed, habitat, age);
        this.domesticated = false;
    }

    @Override
    public void makeNoise() {
        System.out.println("Haaarrr");
    }

    @Override
    public String toString() {
        return "WildCat{" +
                "domesticated=" + domesticated +
                ", breed='" + breed + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                '}';
    }
}
