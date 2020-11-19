package Interrogation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Police {
    private static List<Suspect> suspect = new ArrayList<>();
    ;
    private static Map<Suspect, Integer> statistic = new HashMap<>();


    public static void main(String[] args) {
        simulate();
        for (Suspect actual : statistic.keySet()){
            System.out.println(actual.getClass()+" összes évei: "+statistic.get(actual));
        }

    }

    public static void addToMap(Suspect bro, int year) {
        if (statistic.containsKey(bro)) {
            statistic.put(bro, statistic.get(bro) + year);
        } else {
            statistic.put(bro, year);
        }
    }

    public static void simulate() {
        suspect.add(new BadGuy());
        suspect.add(new NaivGuy());
        suspect.add(new RandomGuy());
        suspect.add(new PrejudicedGuy());
        suspect.add(new EyeToEyeStrictly());
        suspect.add(new EyeToEyeFlexible());
        suspect.add(new EyeToEyeStatistic());

        for (int i = 0; i < 30; i++) {
            for (Suspect one : suspect) {
                for (Suspect two : suspect) {
                    if (one.equals(two)) {
                        break;
                    } else {
                        investigate(one, two);
                        investigate(two, one);
                    }
                }
            }
        }

    }

    public static void investigate(Suspect one, Suspect two) {
        boolean confessOne = one.confess(two);
        boolean confessTwo = two.confess(one);
        if (confessOne && confessTwo) {
            one.setPunishment(two, 2);
            addToMap(one, 2);
            two.setPunishment(one, 2);
            addToMap(two, 2);
        } else if (confessOne && !confessTwo) {
            one.setPunishment(two, 3);
            two.setPunishment(one, 0);
            addToMap(one, 3);
            addToMap(two, 0);
        } else if (!confessOne && !confessTwo) {
            one.setPunishment(two, 1);
            two.setPunishment(one, 1);
            addToMap(one, 1);
            addToMap(two, 1);
        } else if (!confessOne && confessTwo) {
            one.setPunishment(two, 0);
            two.setPunishment(one, 3);
            addToMap(one, 0);
            addToMap(two, 3);
        }
    }


}
