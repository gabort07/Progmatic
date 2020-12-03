package Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleApp {
    public static void main(String[] args) {
            SUV car = new SUV();
            FamilyCar car2 = new FamilyCar();
            SportCar car3 = new SportCar();

        System.out.println(getTargetCustomer(car));
        System.out.println(getTargetCustomer(car2));
        System.out.println(getTargetCustomer(car3));
        
    }

    public static String getTargetCustomer(Vehicle vh){
        if(vh.nrOfSeats()<=4){
            return "Sportembereknek ajánlott";
        }else if(vh.nrOfSeats()==5){
            return "Tereprejáróknak ajánlott";
        }else if(vh.nrOfSeats()==7){
             return "Csaláoknak ajánlott";
        }
        return "Mindenkinek";
    }
}
