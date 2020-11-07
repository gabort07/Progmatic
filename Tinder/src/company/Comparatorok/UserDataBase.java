package company.Comparatorok;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UserDataBase {
  private HashMap<Integer, HashSet<User>> mapOfUsers;
  private List<Swipes> listOfSwipes;

  public HashMap<Integer, HashSet<User>> getMapOfUsers() {
    return mapOfUsers;
  }

  public void setMapOfUsers(HashMap<Integer, HashSet<User>> mapOfUsers) {
    this.mapOfUsers = mapOfUsers;
  }

  public List<Swipes> getListOfSwipes() {
    return listOfSwipes;
  }

  public void setListOfSwipes(List<Swipes> listOfSwipes) {
    this.listOfSwipes = listOfSwipes;
  }
}
