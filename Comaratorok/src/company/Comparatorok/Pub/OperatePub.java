package company.Comparatorok.Pub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OperatePub {

    public void setUpPub() {
        Pub pub = new Pub();
        HashMap<String, Drink> map = new HashMap<>();
        map.put("Sör", new Drink("Sör", 15, 0.04, 100));
        map.put("Wine", new Drink("Wine", 15, 0.11, 120));
        map.put("Palinka",new Drink("Palinka", 5, 0.30, 200));
        map.put("Water",new Drink("Water", 1, 0, 40));
    }

    public static List<Drink> getTypeOfDrink(String key, HashMap<Drink, List<Drink>> storage) {
        return new ArrayList<Drink>(storage.get(key));
    }


}
