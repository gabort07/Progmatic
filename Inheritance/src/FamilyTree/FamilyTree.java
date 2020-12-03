package FamilyTree;

import java.util.Scanner;

public class FamilyTree {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a személy nevét: ");
        String name = sc.next();
        Person person = new Person(name);

        System.out.println("név: " + person.getName() + " ID: " + person.getID());

        System.out.println("Kinek a szüleit adjuk meg? Adja meg az azonosítót");
        int id = sc.nextInt();


//        System.out.println("Kérem az anyja nevét:  ");
//        String motherName = sc.next();
//        System.out.println("Kérem az apja nevét: ");
//        String fatherName = sc.next();
//
//
//        System.out.println(person);

    }
}
