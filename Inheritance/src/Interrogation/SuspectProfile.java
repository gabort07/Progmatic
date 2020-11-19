package Interrogation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SuspectProfile implements Suspect{
    private Map<Suspect, List<Boolean>> cooperation = new HashMap<>();

    public Map<Suspect, List<Boolean>> getCooperation() {
        return cooperation;
    }

    public void setCooperation(Map<Suspect, List<Boolean>> cooperation) {
        this.cooperation = cooperation;
    }

    @Override
    public void setPunishment(Suspect other, int year) {
        if (year <=1 ) {
            getCooperation().putIfAbsent(other, new ArrayList<>());
            getCooperation().get(other).add(true);
        } else if (year <= 3) {
            getCooperation().putIfAbsent(other, new ArrayList<>());
            getCooperation().get(other).add(false);
        }
    }
}
