package company.Comparatorok;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        UserDataBase dataBase = new UserDataBase();
        Operator operator = new Operator(dataBase);
        operator.writeFromFile("Files/users.txt","Files/swipe.txt");

        System.out.println("4. Ki az alkalmaz�s �kir�lyn�je�? " +
                "(Melyik n�i felhaszn�l�t jel�lt�k be a legt�bben kedvencnek?) " +
                "Ha holtverseny alakul ki, akkor �rd ki az �sszes felhaszn�l� nev�t!" +  );

    }
}
