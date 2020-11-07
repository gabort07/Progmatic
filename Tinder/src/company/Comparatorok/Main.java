package company.Comparatorok;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        UserDataBase dataBase = new UserDataBase();
        Operator operator = new Operator(dataBase);
        operator.writeFromFile("Files/users.txt","Files/swipe.txt");

        System.out.println("4. Ki az alkalmazás “királynõje”? " +
                "(Melyik nõi felhasználót jelölték be a legtöbben kedvencnek?) " +
                "Ha holtverseny alakul ki, akkor írd ki az összes felhasználó nevét!" +  );

    }
}
