package TryCatchGyaksi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExcTrial {

    public static void main(String[] args) throws IOException, DangerousColor, BadLanguageException, InvalidChessBoardException {

//        ThoughtANumber thoughtANumber = new ThoughtANumber();
//        thoughtANumber.play();
//        thoughtANumber.linePrinter();
//        LanguageCheck languageCheck = new LanguageCheck();
//        String s = "Írj gondoltam egy számra játékot. A gép gondol egy számra 0 és 100 között, a felhasználó meg betyár azt kitalálni. A program írja ki, hogy a felhasználó által tippelt szám kisebb vagy nagyobb-e az céda gondolt csibész! Ha épp egyenlő, akkor vége van a játéknak. Ha a felhasználó nem számot ír a terminálra, akkor a program írja ki, hogy számot kérek! Ehhez használj hibakezelést (try-catch blokkot)!\n";
//        languageCheck.speakNicely("Maci, Laci");
//        languageCheck.speakNicely(s);
//        NumbersFromFIle numbersFromFIle = new NumbersFromFIle();
//        numbersFromFIle.numbrsFromFile("files/number.txt");

        ChessFieldController chess = new ChessFieldController();
        chess.readFile("files/sakk.txt");

    }
//        System.out.println("main begins");
//        ExcTrial excTrial = new ExcTrial();
//        try {
//            System.out.println(excTrial.firstLetterOfNameCautious());
//            System.out.println(excTrial.firstLetterOfNameBrave());
//        }
//        catch (NullPointerException e){
//            System.out.println("excTrial.firstLetterOfNameBrave() threw Nullpointer exception");
//        }
//        excTrial.readFile("");
//        try{
//            System.out.println(excTrial.reactToColor("yellow"));
//            System.out.println(excTrial.reactToColor("fehér"));
//            System.out.println(excTrial.reactToColor("red"));
//        }
//        catch (DangerousColor dex){
//            System.out.println("Jujj, veszélyes szín. Ennyire veszélyes: " + dex.dangerLevel());
//        }
//
//        System.out.println("main ended");
//    }
//
//    private String name;
//
//    public char firstLetterOfNameBrave() {
//        System.out.println("firstLetterOfNameBrave begins");
//        char ret =  name.charAt(0);
//        System.out.println("firstLetterOfNameBrave ends immediately");
//        return ret;
//    }
//
//    public void readFile(String path) throws FileNotFoundException {
//        File f = new File(path);
//        Scanner sc = null;
//        try {
//            sc = new Scanner(f);
//        }
//        catch (Exception e){
//            System.out.println("file not found");
//        }
//        finally {
//            if(sc != null) {
//                sc.close();
//            }
//        }
//
//    }
//
//    public String reactToColor(String color) throws DangerousColor {
//        if("yellow".equalsIgnoreCase(color)){
//            return "A nap és az irigység színe";
//        }
//        if("green".equalsIgnoreCase(color)){
//            return "Ilyen színű a fű.";
//        }
//        if("red".equalsIgnoreCase(color)){
//            DangerousColor dg = new DangerousColor();
//            throw dg;
//        }
//        else{
//            return "nemtom";
//        }
//    }
//
//    public Character firstLetterOfNameCautious(){
//        System.out.println("firstLetterOfNameCautious begins");
//        Character ret = null;
//        try{
//            ret = name.charAt(0);
//        }
//        catch(NullPointerException e){
//            System.out.println("Ooops name was not initialized");
//        }
//        catch(StringIndexOutOfBoundsException e){
//            System.out.println("Oooop, why don't we have a 0.th char?");
//        }
//        System.out.println("firstLetterOfNameCautious ends immediately");
//        return ret;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
