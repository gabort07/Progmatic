package Interrogation;

public class EyeToEyeFlexible extends SuspectProfile {
    @Override
    public boolean confess(Suspect other) {
        if (getCooperation().containsKey(other)) {
            return getCooperation().get(other).get(getCooperation().get(other).size() - 1);
        }
        return false;
    }
}
