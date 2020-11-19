package Interrogation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrejudicedGuy extends SuspectProfile {
    private HashMap<Boolean, List<Suspect>> cooperativeList = new HashMap<>();

    @Override
    public boolean confess(Suspect other) {
        if (cooperativeList.isEmpty()) {
            return false;
        } else if (cooperativeList.containsKey(true)) {
            return true;
        } else if (cooperativeList.containsKey(false)) {
            return false;
        } else return cooperativeList.get(true).size() >= cooperativeList.get(false).size();
    }

    @Override
    public void setPunishment(Suspect other, int year) {
        if (year <= 1) {
            getCooperation().putIfAbsent(other, new ArrayList<>());
            getCooperation().get(other).add(true);
            cooperativeList.putIfAbsent(true, new ArrayList<>());
            cooperativeList.get(true).add(other);
        } else if (year <= 3) {
            getCooperation().putIfAbsent(other, new ArrayList<>());
            getCooperation().get(other).add(false);
            cooperativeList.putIfAbsent(false, new ArrayList<>());
            cooperativeList.get(false).add(other);
        }


    }
}
