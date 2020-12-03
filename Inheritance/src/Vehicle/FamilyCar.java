package Vehicle;

public class FamilyCar implements Vehicle{

    @Override
    public int maxSpeed() {
        return 210;
    }

    @Override
    public int nrOfSeats() {
        return 7;
    }

    @Override
    public int weight() {
        return 1700;
    }

    @Override
    public int capacityOfBoot() {
        return 450;
    }

    @Override
    public int price(int age) {
        return 10000000/age;
    }

}
