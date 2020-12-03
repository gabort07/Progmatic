package Vehicle;

public class SUV implements Vehicle{
    @Override
    public int maxSpeed() {
        return 170;
    }

    @Override
    public int nrOfSeats() {
        return 5;
    }

    @Override
    public int weight() {
        return 1800;
    }

    @Override
    public int capacityOfBoot() {
        return 700;
    }

    @Override
    public int price(int age) {
        return 8000000/age;
    }
}
