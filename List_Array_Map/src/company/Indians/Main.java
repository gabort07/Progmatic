package company.Indians;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        IndianDB db = new IndianDB();

        System.out.println("Hány indián szerepel a leltárban?\n" +
                db.indians.size());

        System.out.println("Hány különböző fajta eszköz szerepel a leltárban?\n" +
                db.printAllTools());

        System.out.println("Hányan vannak egy adott indián törzsben? \n" +
                db.reservation.get("Seminole").size());

        System.out.println("Milyen a férfi arány a Seminole törzsben?\n" +
               db.countIndians("f","Seminole"));

        System.out.println("Kik alkotják a vének tanácsát az apache törzsben? " +
                "(A vének arról ismerszenek meg, hogy van békepipájuk.)\n"+
                  db.oldGuys("Apache"));

        System.out.println("Hány indiánnak van íja?\n"
                            + db.countBowMan());

        System.out.println("Hány mezítlábas indián van? Mennyi az átlagéletkoruk? \n" +
                         db.averageAgeOfBootleses());




    }













}

