package company.Indians;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class IndianDB {

    public List<Indian> indians = writeDataFromFile("Files/indianok.txt");
    HashMap<String, List<Indian>> indianReserv = indianReserv();

    public IndianDB() throws FileNotFoundException {
    }

    public void printNumberOfTools(HashMap<String, HashMap<String, Integer>> tool) {

    }

    public HashMap<String, HashMap<String, Integer>> countToolsInClans() {
        HashMap<String, HashMap<String, Integer>> toolsByClans = new HashMap<>();

        for (String actualClan : this.indianReserv.keySet()) {
            toolsByClans.put(actualClan, numberOfTools(actualClan));
        }
        return toolsByClans;
    }


    public HashMap<String, Integer> numberOfTools(String actualClan) {
        HashMap<String, Integer> numberOfTools = new HashMap<>();
        for (Indian actualIndian : this.indianReserv.get(actualClan)) {
            for (String tool : actualIndian.getTools()) {
                if (numberOfTools.containsKey(tool)) {
                    int i = numberOfTools.get(tool) + 1;
                    numberOfTools.put(tool, i);
                } else {
                    numberOfTools.put(tool, 1);
                }
            }
        }

        return numberOfTools;
    }

    public String countByCriteries(int age) {
        String clan = "";
        int counter = 0;
        for (String actualClan : this.indianReserv.keySet()) {
            int toolCounter = 0;
            for (Indian actualIndian : this.indianReserv.get(actualClan)) {
                if (actualIndian.getAge() < age) {
                    toolCounter += actualIndian.countTools();
                }
            }
            if (toolCounter > counter) {
                counter = toolCounter;
                clan = actualClan;
            }
        }
        return clan;
    }

    public String countByCriteries(String gender, String tool) {
        Iterator<String> clans = this.indianReserv.keySet().iterator();
        int members = 0;
        String clan = "";
        while (clans.hasNext()) {
            String actualClan = clans.next();
            Iterator<Indian> clanMembers = this.indianReserv.get(actualClan).listIterator();
            int clanMemberCounter = 0;
            while (clanMembers.hasNext()) {
                Indian actualIndian = clanMembers.next();
                if (actualIndian.getTools().contains(tool) && actualIndian.getGender().equals(gender)) {
                    clanMemberCounter++;
                }
            }
            if (clanMemberCounter > members) {
                members = clanMemberCounter;
                clan = actualClan;
            }
        }
        return clan;
    }

    public String mostPopulatedClan() {
        String biggest = "";
        int members = 0;
        for (String clan : this.indianReserv.keySet()) {
            if (this.indianReserv.get(clan).size() > members) {
                members = this.indianReserv.get(clan).size();
                biggest = clan;
            }
        }
        return biggest;
    }

    public HashMap<String, List<Indian>> indianReserv() {
        HashMap<String, List<Indian>> reservatin = new HashMap<>();
        for (Indian indian : this.indians) {
            reservatin.putIfAbsent(indian.getClan(), new ArrayList<>());
            reservatin.get(indian.getClan()).add(indian);
        }
        return reservatin;
    }

    public List<Indian> writeDataFromFile(String pathName) throws FileNotFoundException {
        List<Indian> indians = new ArrayList<Indian>();
        Scanner sc = new Scanner(new File(pathName));
        while (sc.hasNextLine()) {
            String[] parts = sc.nextLine().split(",");
            int age = Integer.parseInt(parts[3]);
            String[] tools = parts[4].split("\\|");
            HashSet<String> toolsList = new HashSet<>(Arrays.asList(tools));
            indians.add(new Indian(parts[0], parts[1], parts[2], age, toolsList));

        }
        return indians;
    }

    public int averageAgeOfBootleses() {
        List<Indian> bootlesIndians = new ArrayList<>();
        double age = 0;
        for (Indian indian : this.indians) {
            if (indian.getTools().contains("mokaszin")) {
                age += indian.getAge();
                bootlesIndians.add(indian);
            }
        }
        return (int) age / bootlesIndians.size();
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
        for (Indian indian : this.indianReserv.get(clan)) {
            if (indian.getTools().contains("békepipa")) {
                indians.add(indian.getName());
            }
        }
        return indians;
    }

    public double countIndians(String gender, String clan) {
        double n = 0;
        for (Indian indian : this.indianReserv.get(clan)) {
            if (indian.getGender().equals(gender)) {
                n++;
            }
        }
        return n / indianReserv.get(clan).size();
    }

    public int printAllTools() {
        HashSet<String> allTools = new HashSet<>();
        for (Indian indian : this.indians) {
            allTools.addAll(indian.getTools());
        }
        return allTools.size();
    }

}
