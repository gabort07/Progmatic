package Interrogation;

public class EyeToEyeStatistic extends SuspectProfile {
    @Override
    public boolean confess(Suspect other) {
        int yes = 0;
        int no = 0;
        if (getCooperation().containsKey(other)) {
            for (Boolean cooperative : getCooperation().get(other)) {
                if (cooperative) {
                    yes++;
                } else {
                    no++;
                }
            }
            return no > yes;
        }
        return Math.random() > 0.5;
    }
}