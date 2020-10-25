package com.company.Feladatok.Utepites;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ut {
    private String[][] trafficData;
    Car[] cars;

    public void readFromFile(String patName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(patName));

        int rowCounter = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            rowCounter++;
        }
//        System.out.println(carOnRoad);


        trafficData = new String[rowCounter][4];
        sc = new Scanner(new File((patName)));
        for(int i = 0; sc.hasNext(); i++){
            String row = sc.nextLine();
            String[] parts = row.split(" ");
            trafficData[i][0] = parts[0];
            trafficData[i][1] = parts[1];
            trafficData[i][2] = parts[2];
            trafficData[i][3] = parts[3];
        }
        System.out.println(Arrays.deepToString(trafficData));
    }
}
