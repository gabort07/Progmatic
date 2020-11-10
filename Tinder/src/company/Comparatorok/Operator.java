package company.Comparatorok;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.*;

public class Operator {

    private UserDataBase dataBase;


    public Operator(UserDataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void writeFromFile(String userFile, String swipesFile) throws FileNotFoundException {
        Scanner scan1 = new Scanner(new File(swipesFile));
        Scanner scan2 = new Scanner((new File(userFile)));

        List<Swipes> listOfSwipes = new ArrayList<>();

        while (scan1.hasNextLine()) {
            String[] sD = scan1.nextLine().split(",");
            LocalDateTime time = LocalDateTime.of(Integer.parseInt(sD[3]), Integer.parseInt(sD[4]), Integer.parseInt(sD[5]), Integer.parseInt(sD[6]), Integer.parseInt(sD[7]), Integer.parseInt(sD[8]));
            Swipes swipe = new Swipes(Integer.parseInt(sD[0]), Integer.parseInt(sD[1]), sD[2], time);
            listOfSwipes.add(swipe);
        }
        dataBase.setListOfSwipes(listOfSwipes);

        List<User> listOfUsers = new ArrayList<>();
        while (scan2.hasNextLine()) {
            String[] uD = scan2.nextLine().split(",");
            int userID = Integer.parseInt(uD[0]);
            HashSet<Swipes> personalSwipes = new HashSet<>(listOfSwipes);
            User user = new User(userID, uD[1], uD[2], Integer.parseInt(uD[3]), uD[4], uD[5]);
            user.makeSwipeMap(personalSwipes);
            listOfUsers.add(user);
        }
        dataBase.setListOfUsers(listOfUsers);
    }

    public void makeUserMapByGender() {
        HashMap<String, HashSet<User>> usersByGender = new HashMap<>();
        for (User actual : dataBase.getListOfUsers()) {
            usersByGender.putIfAbsent(actual.getGender(), new HashSet<>());
            usersByGender.get(actual.getGender()).add(actual);
        }
        dataBase.setUsersByGender(usersByGender);
    }

    public void printTheMostLiked(String gender) {
        makeUserMapByGender();
        TreeMap<Integer, Integer> mostVotedFemales = new TreeMap<>();
        int id = 0;
        int likes = 0;
        for (Swipes actualSwipe : dataBase.getListOfSwipes()) {
            int actualID = actualSwipe.getSentTo();
            String userGender =dataBase.getListOfUsers().get(actualID).getGender();
            if (actualSwipe.getType().equals("LIKE" ) && userGender.equals(gender)) {
                mostVotedFemales.putIfAbsent(actualID, 1);
                mostVotedFemales.put(actualID, mostVotedFemales.get(actualID)+1);

                for (User actualUser : dataBase.getUsersByGender().get(gender)) {
                    int actualID = actualUser.getId();
                    if (actualUser.getId() == votedID) {
                        mostVotedFemales.putIfAbsent(actualID, 1);
                        mostVotedFemales.put(actualUser.getId(), mostVotedFemales.get(actualID) + 1);
                    }
                }

            }

        }
        int i = 0;
        for (int key : mostVotedFemales.keySet()) {
            if (mostVotedFemales.get(key) > i) {
                i = mostVotedFemales.get(key);
            }
        }

        System.out.println(dataBase.getListOfUsers().get(i+1).getName());
    }
}