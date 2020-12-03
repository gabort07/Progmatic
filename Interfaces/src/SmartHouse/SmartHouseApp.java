package SmartHouse;

import java.util.ArrayList;

public class SmartHouseApp {

    public static void main(String[] args) {

        ArrayList<DoorsAndWindows> downstairsList = new ArrayList<>();
        downstairsList.add(new SmallWindow());
        downstairsList.add(new BigWindow());
        downstairsList.add(new Door());
        downstairsList.add(new BigWindow());
        downstairsList.add(new SmallWindow());

        ArrayList<DoorsAndWindows> upstairsList = new ArrayList<>();
        upstairsList.add(new BigWindow());
        upstairsList.add(new SmallWindow());
        upstairsList.add(new SmallWindow());
        upstairsList.add(new SmallWindow());
        upstairsList.add(new BigWindow());
        House house = new House(downstairsList, upstairsList);

        house.showHouse();
        System.out.println();
        house.heatOn();
        house.showHouse();
        System.out.println();
        house.demist();
        house.showHouse();
    }


}
