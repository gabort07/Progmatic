package Bicicle;

public class CityBike extends Bicicle {

    private boolean lamp;
    private String bell;

    public CityBike(double wheelSize, int frontGear, int[] rearGear, boolean lamp, String bell) {
        super(wheelSize, frontGear, rearGear);
        this.lamp = lamp;
        this.bell = bell;
    }

    public CityBike(){
        lamp = false;
        bell = "BBbrrrrr";
    }

    public void switchLamp (){
        lamp= !lamp;
    }

    public boolean isLit(){
        return lamp;
    }

    public void ringTheBell(){
        System.out.println(bell);
    }

}
