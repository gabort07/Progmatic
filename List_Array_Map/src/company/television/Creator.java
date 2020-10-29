package company.television;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Creator {

    List<TVProgram> tvPrograms = makeList();
    HashMap<String, List<TVProgram>> groupedByChannel = groupedByChannel(tvPrograms);
    HashMap<String, List<TVProgram>> groupedByTitle = groupedByTitle(tvPrograms);

    public Creator() throws FileNotFoundException {
    }

    public boolean isPlayedOnOneChannel() {
        for (String s : groupedByTitle.keySet()) {
            if (groupedByTitle.get(s).size() == 1) {
                return true;
            }
        }
        return false;
    }


    public boolean isPlayedOnEveryChannel() {
        for (String s : groupedByTitle.keySet()) {
            if (groupedByTitle.get(s).size() == groupedByChannel.size()) {
                return true;
            }
        }
        return false;
    }

    public void countChannelsByPrograms() {
        for (Map.Entry<String, List<TVProgram>> tvProgramEntry : groupedByTitle.entrySet()) {
            System.out.println(tvProgramEntry.getKey());
            System.out.println(tvProgramEntry.getValue().size());
        }
    }

    public void countProgramsOnChannels() {
        for (Map.Entry<String, List<TVProgram>> tvProgramEntry : groupedByChannel.entrySet()) {
            System.out.println(tvProgramEntry.getKey());
            System.out.println(tvProgramEntry.getValue().size());
        }
    }

    public String playedOnMostChannel() {
        int max = 0;
        String program = "";
        for (String s : groupedByTitle.keySet()) {
            if (groupedByTitle.get(s).size() > 0) {
                max = groupedByTitle.get(s).size();
                program = s;
            }
        }
        return program;
    }

    public boolean isPlayedOnChannel(String channel, String program) {
        for (TVProgram actualProgram : groupedByChannel.get(channel)) {
            if (actualProgram.getTitle().equals(program)) {
                return true;
            }
        }
        return false;
    }

    public HashMap<String, List<TVProgram>> groupedByTitle(List<TVProgram> programList) {
        HashMap<String, List<TVProgram>> mapOfPrograms = new HashMap<>();
        for (TVProgram actualProgram : programList) {
            mapOfPrograms.putIfAbsent(actualProgram.getTitle(), new ArrayList<>());
            mapOfPrograms.get(actualProgram.getTitle()).add(actualProgram);
        }
        return mapOfPrograms;
    }

    public HashSet<TVProgram> makeListOfPrograms(List<TVProgram> programList) {
        HashSet<TVProgram> tvPrograms = new HashSet<>();
        tvPrograms.addAll(programList);
        return tvPrograms;
    }

    public HashMap<String, List<TVProgram>> groupedByChannel(List<TVProgram> programList) {
        HashMap<String, List<TVProgram>> groupedList = new HashMap<>();
        for (TVProgram actualProgram : programList) {
            groupedList.putIfAbsent(actualProgram.getChannel(), new ArrayList<>());
            groupedList.get(actualProgram.getChannel()).add(actualProgram);
        }
        return groupedList;
    }

    public List<TVProgram> makeList() throws FileNotFoundException {
        List<TVProgram> list = new ArrayList<TVProgram>() {
        };
        list.addAll(writeDataFromFile("Files/musorok2.txt"));
        list.addAll(writeDataFromFile("Files/musorok.txt"));
        return list;
    }

    public List<TVProgram> writeDataFromFile(String pathName) throws FileNotFoundException {
        List<TVProgram> list = new ArrayList<TVProgram>();
        Scanner sc = new Scanner(new File(pathName));
        while (sc.hasNextLine()) {
            String channel = sc.next();
            String title = sc.nextLine().trim();
            TVProgram tvProgram = new TVProgram(channel, title);
            list.add(tvProgram);
        }
        return list;
    }
}
