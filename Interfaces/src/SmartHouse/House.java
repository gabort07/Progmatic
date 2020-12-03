package SmartHouse;

import java.util.ArrayList;

public class House {
    ArrayList<DoorsAndWindows> downStairs;
    ArrayList<DoorsAndWindows> upStairs;

    public House(ArrayList<DoorsAndWindows> dawnstairs, ArrayList<DoorsAndWindows> upstairs) {
        this.downStairs = dawnstairs;
        this.upStairs = upstairs;
    }

    public void heatOn() {
        System.out.println("A fűtés be van kapcsolva és minden nyílászáró be van csukva");
        closeEverything();
    }

    public void closeEverything() {
        for (DoorsAndWindows actual : downStairs) {
            actual.close();
        }
        for (DoorsAndWindows actual : upStairs) {
            actual.close();
        }
    }

    public void showHouse() {
        System.out.print(upStairs.toString());
        System.out.println();
        System.out.println(downStairs.toString());
    }

    public void demist() {
        for (DoorsAndWindows actual : downStairs) {
            if (actual instanceof SmallWindow) {
                actual.open();
            }
        }
        for (DoorsAndWindows actual : upStairs) {
            if (actual instanceof SmallWindow) {
                actual.open();
            }
        }
    }

}
