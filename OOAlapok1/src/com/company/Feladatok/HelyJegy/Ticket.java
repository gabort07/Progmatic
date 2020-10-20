package com.company.Feladatok.HelyJegy;

public class Ticket {

    private int seatNumber;
    private int getIn;
    private int getOut;
    private int ticketPreis;
    private int distance;

    public Ticket(int seat, int getIn, int getOut) {
        this.seatNumber = seat;
        this.getIn = getIn;
        this.getOut = getOut;
        this.distance = getOut - getIn;

    }

    public int getTicketPreis() {
        return ticketPreis;
    }

    public void setTicketPreis(int ticketPreis) {
        this.ticketPreis = (int) (Math.round(ticketPreis / 5.0)) * 5;
    }

    public int getDistance() {
        return distance;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getGetIn() {
        return getIn;
    }

    public int getGetOut() {
        return getOut;
    }
}
