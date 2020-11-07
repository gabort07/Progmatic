package company.Comparatorok;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.*;

public class Operator {

    private UserDataBase dataBase;

    public Operator(UserDataBase dataBase){this.dataBase=dataBase;}

    public void writeFromFile(String userFile, String swipesFile) throws FileNotFoundException {
        Scanner scan1 = new Scanner(new File(swipesFile));
        Scanner scan2 = new Scanner((new File(swipesFile)));

        List<Swipes> listOfSwipes = new ArrayList<>();

        while (scan1.hasNextLine()) {
            String[] sD = scan1.nextLine().split(",");
            LocalDateTime time = LocalDateTime.of(Integer.parseInt(sD[3]), Integer.parseInt(sD[4]), Integer.parseInt(sD[5]), Integer.parseInt(sD[6]), Integer.parseInt(sD[7]), Integer.parseInt(sD[8]));
            Swipes swipe = new Swipes(Integer.parseInt(sD[0]), Integer.parseInt(sD[1]), sD[2], time);
            listOfSwipes.add(swipe);
        }
        dataBase.setListOfSwipes(listOfSwipes);

        HashMap<Integer, HashSet<User>> mapOfUsers = new HashMap<>();
        while( scan2.hasNextLine()){
            String[] uD = scan2.nextLine().split(",");
            int userID = Integer.parseInt(uD[0]);
            HashSet<Swipes> personalSwipes = new HashSet<>(listOfSwipes);
            User user = new User(userID, uD[1], uD[2], Integer.parseInt(uD[3]), uD[4], uD[5]);
            user.makeSwipeMap(personalSwipes);

            mapOfUsers.putIfAbsent(userID, new HashSet<>());
            mapOfUsers.get(userID).add(user);
        }
        dataBase.setMapOfUsers(mapOfUsers);
    }

public void printTheMostVoted(String gender){
        HashMap<String, HashSet<User>> actualMap = new HashMap<>();
        TreeMap<Integer, HashSet<Swipes>> treeOfVoted = new TreeMap<>();
        for(Swipes actual : dataBase.getListOfSwipes()){
            treeOfVoted.ad
        }

}

}
