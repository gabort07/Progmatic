package Abstract;

public  class Dog extends Felidea   {

    public Dog(String breed, String habitat, int age) {
        super(breed, habitat, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Vau-Vau");
    }

    public void letsPlay(){
        System.out.println("Happy dog");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", habitat='" + habitat + '\'' +
                ", age=" + age +
                '}';
    }
}
