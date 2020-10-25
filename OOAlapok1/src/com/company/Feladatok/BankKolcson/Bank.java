package com.company.Feladatok.BankKolcson;

public class Bank {
    public static void main(String[] args) {

        CreditRequest request = new CreditRequest("Béla", true, 600000, 15);
        CreditRequest request1 = new CreditRequest("Margit", false, 15000000, 24);
        CreditRequest request2 = new CreditRequest("Teca", false, 500000, 10);
        CreditCalculator calculator = new CreditCalculator();

        calculator.considerRequest(request, request.status);
        calculator.considerRequest(request1,request1.status);
        calculator.considerRequest(request2, request2.status);

        printStatusOfRequest(request);
        System.out.println();
        printStatusOfRequest(request1);
        System.out.println();
        printStatusOfRequest(request2);


    }

    public static void printStatusOfRequest(CreditRequest request) {
        System.out.println(request.getAppplicant() + " kérelmének állapota:");
        System.out.println(request.status.isGarantied() ? "Sikeres kérelem" : "Sikertelen hitelkérelem.");
        System.out.println(request.status.NeedSuccesor() ? "Kezes szükséges" : "Nem szükséges kezes");
        System.out.println(request.status.NeedCoverage() ? "Fedezet szükséges" : "Nem szükséges fedezet");
        System.out.println("A fedezet összege minimum " + request.status.getCoverageAmount() + " Ft");
        System.out.println("A havi törleztő részlet összege " + request.status.getMonthlyFee() + " Ft");

    }
}
