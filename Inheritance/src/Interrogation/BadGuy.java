package Interrogation;

public class BadGuy extends SuspectProfile {
    @Override
    public boolean confess(Suspect other) {
        return true;
    }

}
