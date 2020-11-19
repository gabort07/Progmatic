package Interrogation;

public class EyeToEyeStrictly extends SuspectProfile {
    @Override
    public boolean confess(Suspect other) {
        if (getCooperation().containsKey(other)) {
            return getCooperation().get(other).contains(false);
        }
        return false;
    }
}