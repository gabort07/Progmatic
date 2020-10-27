package company.Person;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] names = {"A","B","C","D","E","F","G","B","C","C"};
        Group group = new Group();

        for(int i =0; i < names.length; i++){
            group.persons.add(new Person(names[i]));
        }
        for (int i = 0; i < group.persons.size(); i++) {
            System.out.println(group.persons.get(i).getName());
        }

        HashSet<Person> personSet = new HashSet<Person>(group.persons);
        System.out.println(personSet.size());
        System.out.println(personSet);

        ArrayList<Integer> twenty = new ArrayList<>(1000);
        for (int i = 0; i < 1000; i++) {
            twenty.add((int) (Math.random() * 20 + 1));
        }

        HashSet<Integer> newSet = new HashSet<Integer>(twenty);
        System.out.println(newSet);

        ArrayList<Integer> eleven = new ArrayList<Integer>();

        int c = 0;
        for (int i : twenty) {
            if(i == 11){
                c++;
            }
        }

        System.out.println(c);

    }

}
