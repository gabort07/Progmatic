package company.Comparatorok.Pub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OperatePub {

    public static void setUpPub(Pub pub) {
        HashMap<String, Drink> map = new HashMap<>();
        List<Guest> list = new ArrayList<>();
        map.put("Sör", new Drink("Sör", 15, 0.04, 100,0.5));
        map.put("Wine", new Drink("Wine", 15, 0.11, 120,0.3));
        map.put("Palinka", new Drink("Palinka", 2, 0.30, 200,0.04));
        map.put("Water", new Drink("Water", 1, 0, 40,0));
        pub.setDrinkStorage(map);
        for (int i = 1; i <=10; i++ ){
            list.add(new Guest(i));
        }
        pub.setGuests(list);
    }

    public static List<Drink> getTypeOfDrink(String key, HashMap<Drink, List<Drink>> storage) {
        return new ArrayList<Drink>(storage.get(key));
    }

    public static void printOut(HashMap<String, Drink> list, List<Guest> guest) {
        System.out.println(list.toString());
        System.out.println(guest.toString());
    }

    public static String chooseRandomDrink() {
        int drink = (int) (Math.random() * 4 + 1);
        return switch (drink) {
            case 1 -> "Sör";
            case 2 -> "Wine";
            case 3 -> "Palinka";
            case 4 -> "Water";
            default -> "";
        };
    }
    public static void pubRunning(List<Guest> guestList, HashMap<String, Drink> drinkStorage){
        for (double i = 0; i <= 16; i+=0.5) {
            for (Guest actualGuest : guestList){
                String favoriteDrink = actualGuest.getFavoriteDrink();
                if(actualGuest.isThirsty()){
                    if(drinkStorage.containsKey(favoriteDrink)){
                        drinkStorage.get(favoriteDrink).getQuantity();
                    }
                }
            }
        }
    }

    public static void serveGuest(HashMap<String, Drink> drinkMap, String drink){

    }

}
