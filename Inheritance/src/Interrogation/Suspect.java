package Interrogation;

public interface Suspect {
    boolean confess(Suspect other);
    void setPunishment(Suspect other, int year);
}
