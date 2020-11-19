package Interrogation;

public class RandomGuy extends SuspectProfile {
    @Override
    public boolean confess(Suspect other) {
        return Math.random() > 0.5;
    }

}
