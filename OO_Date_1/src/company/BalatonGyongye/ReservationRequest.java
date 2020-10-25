package company.BalatonGyongye;

import java.time.LocalDate;

public class ReservationRequest {
    private LocalDate startDate;
    private LocalDate endDate;
    private int nrOfPersons;
    private String meals;

    public ReservationRequest(LocalDate startDate, LocalDate endDate, int nrOfPersons, String meals) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.nrOfPersons = nrOfPersons;
        this.meals = meals;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getendDate() {
        return endDate;
    }

    public void setDateendDate(LocalDate endDate) {
        endDate = endDate;
    }

    public int getNrOfPersons() {
        return nrOfPersons;
    }

    public void setNrOfPersons(int nrOfPersons) {
        this.nrOfPersons = nrOfPersons;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }
}
