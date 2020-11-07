package company.Comparatorok;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UserDataBase {
  private List<User> listOfUsers;
  private List<Swipes> listOfSwipes;
  private HashMap<String, HashSet<User>> usersByGender;


  public void setUsersByGender(HashMap<String, HashSet<User>> usersByGender) {
    this.usersByGender = usersByGender;
  }

  public HashMap<String, HashSet<User>> getUsersByGender() {
    return usersByGender;
  }

  public List<User> getListOfUsers() {
    return listOfUsers;
  }

  public void setListOfUsers(List<User> listOfUsers) {
    this.listOfUsers = listOfUsers;
  }

  public List<Swipes> getListOfSwipes() {
    return listOfSwipes;
  }

  public void setListOfSwipes(List<Swipes> listOfSwipes) {
    this.listOfSwipes = listOfSwipes;
  }
}
