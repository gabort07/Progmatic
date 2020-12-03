package TryCatchGyaksi;

import java.io.File;
import java.util.*;

public class ThoughtANumber {



    public void play() {
        int randomNumber = (int) (Math.random() * 100 + 1);
        System.out.println("Gondoltam egy számra! Találd ki melyik az!");
        boolean match = false;
        while (!match) {
            Scanner sc = new Scanner(System.in);
            int userNumber = 0;
            try {
                match = true;
                userNumber = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                match = false;
                System.out.println("Számot adj meg!");
            }
            if (userNumber == randomNumber) {
                match = true;
                System.out.println("Erre a számra gondoltam");
            } else if (userNumber < randomNumber) {
                match = false;
                System.out.println("Nagyobb számra gondoltam! Tippelj újra");
            } else {
                match = false;
                System.out.println("Kissebb számra gondolta! Tippelj újra");
            }
        }
    }

    public void linePrinter() {
        ArrayList<String> fileLines = new ArrayList<>();
        readFile(fileLines);
        findLine(fileLines);

    }
    public void readFile(ArrayList<String> fileLines){
        boolean match = false;
        Scanner scan = null;
        while (!match) {
            System.out.println("Kérem az elérési utat!");
            Scanner sc = new Scanner(System.in);
            String path = sc.nextLine();
            try {
                match = true;
                scan = new Scanner(new File(path));
            } catch (Exception e) {
                match = false;
                System.out.println("A fájl nem található!");
            }
        }

        while (scan.hasNextLine()) {
            String parts = scan.nextLine();
            fileLines.add(parts);
        }
    }
    public void findLine(ArrayList<String> fileLines){
        boolean hasLine = false;
        while (!hasLine) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Melik sórt köll teeee?");
            try {
                hasLine = true;
                int line = Integer.parseInt(sc.nextLine());
                System.out.println("A sor tartalma: " + fileLines.get(line- 1));
            } catch (IndexOutOfBoundsException e) {
                hasLine = false;
                System.out.println("Nincs ilyen sor a fájlban!");
            } catch (Exception e) {
                hasLine = false;
                System.out.println("Aggyááá számot!");
            }
        }
    }




}
