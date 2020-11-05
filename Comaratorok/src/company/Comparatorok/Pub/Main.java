package company.Comparatorok.Pub;

public class Main {
    public static void main(String[] args) {
        Pub pub = new Pub();
        OperatePub.setUpPub(pub);
        OperatePub.printOut(pub.getDrinkStorage(), pub.getGuests());
        OperatePub.pubRunning(pub.getGuests(), pub.getDrinkStorage());



    }
}
