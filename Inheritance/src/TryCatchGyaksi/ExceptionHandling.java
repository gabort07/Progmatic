package TryCatchGyaksi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ExceptionHandling {

    public LocalDate string2Date(String s) {
        LocalDate date;
        try {
            date = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Nem megfelelő formátum, a helyes: yyyy-MM-dd");
        }
        return date;
    }
}
