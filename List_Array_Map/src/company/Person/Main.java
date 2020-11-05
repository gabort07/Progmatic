package company.Person;

import java.util.*;

public class Main {

    String stuff;

    public static void main(String[] args) {

        /*
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(18);
        numbers.add(17);
        numbers.add(1);
        numbers.add(3);
        numbers.add(35);
        numbers.add(36);
        numbers.add(37);
        numbers.add(38);
        numbers.add(39);
        numbers.add(30);
        numbers.add(31);
        numbers.add(32);

        System.out.println(numbers);

        HashSet<Person> people = new HashSet<>();
        people.add( new Person("Béla", 28) );
        people.add( new Person("Lajoska", 29) );
        people.add( new Person("Julcsi", 25) );

        System.out.println(people);
        */

        Person p1 = new Person("Béla", 28);
        Person p2 = new Person("Lajoska", 29);
        Person p3 = new Person("Julcsi", 28);
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);

        HashMap<Integer, Person> people = new HashMap<>();
        people.put(p1.getAge(), p1);
        people.put(29, p2);
        people.put(28, p3);

        System.out.println(people.get(28));
        System.out.println(people.size());

        for (Integer integer : people.keySet()) {
            // 28, 29
            System.out.println("1"+integer);
            System.out.println( people.get(integer) );
        }
        for (Map.Entry<Integer, Person> personEntry : people.entrySet()) {
            // key: 28, value: Julcsi
            // key: 29, value: Lajoska
            System.out.println( personEntry.getKey() );
            System.out.println( personEntry.getValue() );
        }

        //////////////

        HashMap<Integer, ArrayList<Person>> peopleByAge = new HashMap<>();
        /*
        for (Person person : peopleList) {
            if (peopleByAge.containsKey( person.getAge() )) {
                peopleByAge.get( person.getAge() ).add( person );
            } else {
                ArrayList<Person> newList = new ArrayList<>();
                newList.add(person);
                peopleByAge.put( person.getAge(), newList );
            }
        }
        */
        for (Person person : peopleList) {
            peopleByAge.putIfAbsent(person.getAge(), new ArrayList<>());
            peopleByAge.get( person.getAge() ).add( person );
        }



    }
}
