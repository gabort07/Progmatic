package com.company.Feladatok.HelyJegy;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        TravelByBus tbb = new TravelByBus();

        tbb.writeDataFromFile("Files/eladott.txt");


//        Adja meg a legutolsó jegyvásárló ülésének sorszámát és az általa beutazott távolságot!
//A kívánt adatokat a képernyőn jelenítse meg!
        tbb.printLastPassengerDate();
        System.out.println();

//        Listázza ki, kik utazták végig a teljes utat! Az utasok sorszámát egy-egy szóközzel
//elválasztva írja a képernyőre!
        tbb.whoTookTheWholeRide();
        System.out.println();

//        Határozza meg, hogy a jegyekből mennyi bevétele származott a társaságnak!
//Az eredményt írja a képernyőre!
        System.out.println("A bevétel az útból: " + tbb.printIncomeFromRide());
        System.out.println();

//        Írja a képernyőre, hogy a busz végállomást megelőző utolsó megállásánál hányan szálltak
//fel és le!
        tbb.getLastStopInOut();

//        Adja meg, hogy hány helyen állt meg a busz a kiinduló állomás és a célállomás között!
//Az eredményt írja a képernyőre!


    }
}
