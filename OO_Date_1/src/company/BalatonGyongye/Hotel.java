package company.BalatonGyongye;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Hotel {

    private final int priceOfPreseason = 17000;
    private final int priceOfHighseason = 21000;
    private final int priceOfOffseason = 15000;
    private final LocalDate highseasonStart = LocalDate.of(2021, 6, 1);
    private final LocalDate offseasonStart = LocalDate.of(2021, 9, 1);
    private final int priceOfBreakfast = 1500;
    private final int priceOfLunch = 3000;
    private final int priceOfDinner = 2000;


    ReservationResponse doReservation(ReservationRequest request) {
        return new ReservationResponse(calculatePrice(request));
    }

    public int calculatePrice(ReservationRequest request) {
        long daysBetween = ChronoUnit.DAYS.between(request.getStartDate(), request.getendDate());
        int priceOfRoom = 0;
        int priceOfMeals = (priceOfMeal(request, (int) daysBetween));
        LocalDate actualDay = request.getStartDate();
        for (long i = 0; i < daysBetween; i++) {
            priceOfRoom += priceOfRoom(actualDay);
            actualDay.plusDays(1);
        }
        return priceOfRoom + priceOfMeals;
    }

    public int priceOfRoom(LocalDate day) {
        if (day.isBefore(highseasonStart)) {
            return priceOfPreseason;
        } else if (day.isBefore(offseasonStart)) {
            return priceOfHighseason;
        } else {
            return priceOfOffseason;
        }
    }

    public int priceOfMeal(ReservationRequest request, int days) {
        int price = 0;
        if (request.getMeals().equals("half-board")) {
            price = priceOfBreakfast + priceOfDinner;
        } else if (request.getMeals().equals("just-breakfast")) {
            price = priceOfBreakfast;
        } else if (request.getMeals().equals("all-inclisive")) {
            price = priceOfBreakfast + priceOfLunch + priceOfDinner;
        }
        return price * days;
    }
}
