package FamilyTree;

import java.util.Scanner;

public class Operator {

    public void userGuide() {
        boolean makeNewPerson = true;


//        while (makeNewPerson) {
//            makeFamilyMember(makeNewPerson);
//        } else{
//            printFamilyTree();
//        }

    }

    public void makeFamilyMember(boolean makeNew){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a személy nevét: ");
        String name = sc.next();
        System.out.println("Kérem az anyja nevét:  ");
        String motherName = sc.next();
        System.out.println("Kérem az apja nevét: ");
        String fatherName = sc.next();

//        makePerson(name, motherName, fatherName);

        System.out.println("Szeretne új személyt hozzáadni? (igen/nem)");
        String answer = sc.next();
    }


//    public void makeMother(String name, String motherName, String fatherName){
//        Person
//    }
//
//    public String[] askDaate(){
//
//    }

}
