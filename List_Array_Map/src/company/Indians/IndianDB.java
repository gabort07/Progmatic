package company.Indians;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class IndianDB {

    public List<Indian> indians;
    HashMap<String, List<Indian>> reservation;

    public IndianDB() throws FileNotFoundException {
        this.indians = writeDataFromFile("Files/indianok.txt");
        reservation = makeReservation();
    }

    public HashMap<String, List<Indian>> makeReservation() {
        HashMap<String, List<Indian>> reservatin = new HashMap<>();
        for (Indian indian : this.indians) {
            reservation.putIfAbsent(indian.getClan(), new ArrayList<>());
            reservation.get(indian.getClan()).add(indian);
        }
        return reservatin;
    }

    public List<Indian> writeDataFromFile(String pathName) throws FileNotFoundException {
        List<Indian> indians = new ArrayList<Indian>();
        Scanner sc = new Scanner(new File(pathName));
        HashMap<String, List<Indian>> indiansByClan = new HashMap<>();
        sc = new Scanner(new File(pathName));
        while (sc.hasNext()) {
            String[] parts = sc.nextLine().split(",");
            int age = Integer.parseInt(parts[3]);
            String[] tools = parts[4].split("\\|");
            HashSet<String> toolsList = new HashSet<>(Arrays.asList(tools));
            indians.add(new Indian(parts[0], parts[1], parts[2], age, toolsList));

        }
        return indians;
    }

    public double averageAgeOfBootleses() {
        List<Indian> bootlesIndians = new ArrayList<>();
        double age = 0;
        for (Indian indian : this.indians) {
            if (indian.getTools().contains("mokaszin")) {
                age += indian.getAge();
                bootlesIndians.add(indian);
            }
        }
        return age / bootlesIndians.size();
    }

    public int countBowMan() {
        int n = 0;
        for (Indian indian : this.indians) {
            if (indian.getTools().contains("íj")) {
                n++;
            }
        }
        return n;
    }

    public List<String> oldGuys(String clan) {
        List<String> indians = new ArrayList<>();
        for (Indian indian : this.reservation.get(clan)) {
            if (indian.getTools().contains("békepipa")) {
                indians.add(indian.getName());
            }
        }
        return indians;
    }

    public double countIndians(String gender, String clan) {
        double n = 0;
        for (Indian indian : this.reservation.get(clan)) {
            if (indian.getGender().equals(gender)) {
                n++;
            }
        }
        return n / reservation.get(clan).size();
    }

    public int printAllTools() {
        HashSet<String> allTools = new HashSet<>();
        for (Indian indian : this.indians) {
            allTools.addAll(indian.getTools());
        }
        return allTools.size();
    }

}
