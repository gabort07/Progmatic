package Vehicle;

public class SportCar implements Vehicle{


    @Override
    public int maxSpeed() {
        return 240;
    }

    @Override
    public int nrOfSeats() {
        return 4;
    }

    @Override
    public int weight() {
        return 1300;
    }

    @Override
    public int capacityOfBoot() {
        return 200;
    }

    @Override
    public int price(int age) {
        return 150000000/2;
    }

}
