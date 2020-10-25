package company.BalatonGyongye;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate start1 = LocalDate.of(2021, 4, 16);
        LocalDate end1 = LocalDate.of(2021, 4, 23);
        LocalDate start2 = LocalDate.of(2021, 7, 12);
        LocalDate end2 = LocalDate.of(2021, 7, 19);
        LocalDate start3 = LocalDate.of(2021, 9, 20);
        LocalDate end3 = LocalDate.of(2021, 9, 20);

        ReservationRequest request1 = new ReservationRequest(start1, end1, 3, "half-board");
        Hotel hotel = new Hotel();
        ReservationResponse response1 = hotel.doReservation(request1);
        System.out.println(request1.getStartDate() + "-tól " + request1.getendDate() + "-ig ");
        System.out.println(request1.getNrOfPersons() + " Főre");
        System.out.println(request1.getMeals() + " étkezéssel");
        System.out.println("A foglalás ára: " + response1.getPrice() + " Ft");


    }
}
