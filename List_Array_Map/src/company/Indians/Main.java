package company.Indians;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Indian> indians = writeDataFromFile("Files/indianok.txt");

        HashMap<String, List<Indian>> reservation = new HashMap<>();
        for (Indian indian : indians) {
            reservation.putIfAbsent(indian.getClan(), new ArrayList<>());
            reservation.get(indian.getClan()).add(indian);
        }

        System.out.println("Hány indián szerepel a leltárban?\n" +
                indians.size());


        System.out.println("Hány különböző fajta eszköz szerepel a leltárban?\n" +
                printAllTools(indians));

        System.out.println("Hányan vannak egy adott indián törzsben? \n" +
                reservation.get("Seminole").size());

        System.out.println("Milyen a férfi arány a Seminole törzsben?\n" +
               countIndians(reservation,"f","Seminole"));

        System.out.println("Kik alkotják a vének tanácsát az apache törzsben? " +
                "(A vének arról ismerszenek meg, hogy van békepipájuk.)\n"+
                  oldGuys(reservation,"Apache"));




    }

    public static List<String> oldGuys(HashMap<String, List<Indian>> reservation, String clan) {
        List<String> indians = new ArrayList<>();
        for (Indian indian : reservation.get(clan)) {
            if (indian.getTools().contains("békepipa")) {
               indians.add(indian.getName());
            }
        }
        return indians;
    }

    public static double countIndians(HashMap<String, List<Indian>> reservation, String gender, String clan) {
        double n = 0;
        for (Indian indian : reservation.get(clan)) {
            if (indian.getGender().equals(gender)) {
                n++;
            }
        }
        return n / reservation.get(clan).size();
    }

    public static List<Indian> writeDataFromFile(String pathName) throws FileNotFoundException {
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

    public static int printAllTools(List<Indian> indians) {
        HashSet<String> allTools = new HashSet<>();
        for (Indian indian : indians) {
            allTools.addAll(indian.getTools());
        }
        return allTools.size();
    }


}

