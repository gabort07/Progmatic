package TryCatchGyaksi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersFromFIle {
    List<Integer> numbers = new ArrayList<>();

    public void numbrsFromFile(String filePath) {
        Scanner scan = null;
        try {
            scan = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            System.out.println("Rossz elérési út");
        }

        while (scan.hasNext()) {
            try {
                int part = Integer.parseInt(scan.next());
                numbers.add(part);
            } catch (NullPointerException e) {
                System.out.println("Üres a beolvasott fájl");
            }
            catch (NumberFormatException e) {
                System.out.println("Nem megfelelő szám formátum");
            }
        }
        System.out.println(numbers);
    }
}
