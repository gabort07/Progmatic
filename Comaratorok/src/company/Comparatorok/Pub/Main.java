package company.Comparatorok.Pub;

public class Main {
    public static void main(String[] args) {
        Pub pub = new Pub();
        OperatePub operator = new OperatePub(pub);
        operator.setUpPub();
//        operator.printOut(pub.getDrinkStorage(), pub.getGuests());
        operator.pubRunning(pub.getGuests(), pub.getDrinkStorage());

        String s1 = "alma";
        String s2 = "al" + "ma";
        String s3 = concat("al", "ma");
        System.out.print(s1 == s2);
        System.out.print("-");
        System.out.println(s1 == s3);

    }

    private static String concat(String s1, String s2){
        return s1 + s2;
    }

    }

