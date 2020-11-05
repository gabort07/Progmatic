package company.Comparatorok.Pub;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Pub {
    private HashMap<String, Drink> drinkStorage  = new HashMap<>();

    public HashMap<String, Drink> getDrinkStorage() {
        return drinkStorage;
    }

    public void setDrinkStorage(HashMap<String, Drink> drinkStorage) {
        this.drinkStorage = drinkStorage;
    }
}
