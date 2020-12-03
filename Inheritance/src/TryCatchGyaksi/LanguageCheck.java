package TryCatchGyaksi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LanguageCheck {
    public static Set<String> badWords = new HashSet<>();

    public LanguageCheck() {
        badWords.add("betyár");
        badWords.add("céda");
        badWords.add("csibész");
        badWords.add("gézengúz");
    }


    public void speakNicely(String s) throws BadLanguageException {
        ArrayList<String> text = new ArrayList<>();
        String[] parts = s.split("\\P{IsAlphabetic}+");
        text.addAll(Arrays.asList(parts));
        for (String actual : text) {
            if(badWords.contains(actual)){
                throw new BadLanguageException();
            }
        }
        System.out.println(s);
    }

}
