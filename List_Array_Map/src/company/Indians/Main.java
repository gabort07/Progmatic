package company.Indians;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        IndianDB db = new IndianDB();

//        System.out.println("Hány indián szerepel a leltárban?\n" +
//                db.indians.size());
//
//        System.out.println("Hány különböző fajta eszköz szerepel a leltárban?\n" +
//                db.printAllTools());
//
//        System.out.println("Hányan vannak egy adott indián törzsben? \n" +
//                db.indianReserv.get("Seminole").size());
//
//        System.out.println("Milyen a férfi arány a Seminole törzsben?\n" +
//               db.countIndians("f","Seminole"));
//
//        System.out.println("Kik alkotják a vének tanácsát az apache törzsben? " +
//                "(A vének arról ismerszenek meg, hogy van békepipájuk.)\n"+
//                  db.oldGuys("Apache"));
//
//        System.out.println("Hány indiánnak van íja?\n"
//                            + db.countBowMan());
//
//        System.out.println("Hány mezítlábas indián van? Mennyi az átlagéletkoruk? \n" +
//                         db.averageAgeOfBootleses());

//        System.out.println("Melyik indián törzsben vannak a legtöbben?\n" +
//                db.mostPopulatedClan());

//        System.out.println("Melyik törzsben van a legtöbb férfinak tomahawkja?\n"+
//              db.countByCriteries("f","tomahawk"));

//        System.out.println("Mely törzs gyerekeinek van a legtöbb tulajdona (gyerek az, aki 18 év alatti).\n" +
//                db.countByCriteries(18));

        System.out.println("Írd ki, hogy törzsenként mennyi van az egyes eszközökből!" +
        db.countToolsInClans());

    }


}

