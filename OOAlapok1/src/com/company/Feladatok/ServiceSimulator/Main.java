package com.company.Feladatok.ServiceSimulator;

public class Main {

    public static void main(String[] args) {

        // LocalDateTime t = LocalDateTime.of(2020, 10, 21, 13, 20);
        // t.plus();

        CarService belaba = new CarService();

        for (int week = 1; week < 7; week++) {
            for (float time = 7; time < 19; time += 0.5) {
                double r = Math.random();
                System.out.println("Nap: " + week + " Idő: " + time);
                if (time > 18 && belaba.countRemainingCars() >= 1) {
                    System.out.println("Nincs több hely zárás előtt");
                } else if (time >= 18 && belaba.countRemainingCars() > 1) {
                } else if (r < 0.6) {
                    belaba.addNewCar(new Car());
                    System.out.println("Beállít egy autó a parkolóba");
                } else if (r < 0.8) {
                    belaba.addNewCar(new Car());
                    belaba.addNewCar(new Car());
                    System.out.println("Beállít két autó a parkolóba");
                } else {
                    // Do nothing.
                    System.out.println("Nem állt be autó a parkolóba");
                }

                // megszerelünk 1 autót
                boolean didRepair = belaba.repairNextCar();
                System.out.println(didRepair ? "Megszereltünk egy autót, marad " + belaba.countRemainingCars() :
                        "Bélabá kávézott, maradt " + belaba.countRemainingCars());
            }

            System.out.println("A parkolóban zárás után " + belaba.countRemainingCars() + " autó maradt.");
            if (belaba.notEmptyLot()) {
                System.out.println(belaba.countRemainingCars() + " autónak haza kell mennie.");
                belaba.sendHome();
            }
            System.out.println("Bélabá napi bevétele: " + belaba.getIncome() + " Ft.");
        }
    }
}