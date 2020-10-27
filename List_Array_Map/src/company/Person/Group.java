package company.Person;

import java.util.ArrayList;

public class Group {

    ArrayList<Person> persons = new ArrayList<>();

    public Person calculateMinWeight(ArrayList<Person> people) {
        int weight = 200;
        int index = 0;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getWeight() < weight) {
                weight = people.get(i).getWeight();
                index = i;
            }
        }
        return people.get(index);
    }

    public int sumWeightOfPersons(ArrayList<Person> people) {
        int weight = 0;
        for (Person person : people) {
            weight += person.getWeight();
        }
        return weight;
    }

    public double averageAge(ArrayList<Person> people) {
        double aveAge = 0;
        for (Person person : people) {
            aveAge += person.getAge();
        }
        return aveAge / people.size();
    }

}

