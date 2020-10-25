package com.company.Feladatok.HelyJegy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TravelByBus {

    private int soldTicket;
    private int lineLength;
    private int priseFor10Km;
    private int[][] ticketData;
    Ticket[] tickets;


    public void writeDataFromFile(String pathName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(pathName));

        int rowCounter = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            rowCounter++;
        }

        ticketData = new int[rowCounter][3];

        sc = new Scanner(new File(pathName));
        for (int i = 0; sc.hasNext(); i++) {
            String row = sc.nextLine();
            String[] parts = row.split(" ");
            ticketData[i][0] = Integer.parseInt(parts[0]);
            ticketData[i][1] = Integer.parseInt(parts[1]);
            ticketData[i][2] = Integer.parseInt(parts[2]);
        }
//        System.out.println(Arrays.deepToString(ticketData));

        soldTicket = ticketData[0][0];
        lineLength = ticketData[0][1];
        priseFor10Km = ticketData[0][2];

        tickets = new Ticket[soldTicket];

        for (int i = 1; i < ticketData.length; i++) {
            tickets[i - 1] = new Ticket(ticketData[i][0], ticketData[i][1], ticketData[i][2]);
            tickets[i - 1].setTicketPreis(tickets[i - 1].getDistance() * priseFor10Km);
        }

    }


    public void printLastPassengerDate() {
        int seatNumber = tickets[tickets.length - 1].getSeatNumber();
        int distance = tickets[tickets.length - 1].getGetOut() - tickets[tickets.length - 1].getGetIn();
        System.out.println("A legutolsó jegyvásárló ülésének sorszámát: " + seatNumber
                + ", és az általa beutazott távolság: " + distance);
    }

    public void whoTookTheWholeRide() {
        System.out.println("Utasok akik az egész utat lenyomták NYÉLEN: ");
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].getGetOut() - tickets[i].getGetIn() == lineLength) {
                System.out.print(i + 1 + " ");
            }
        }
        System.out.println();
    }

    public int printIncomeFromRide() {
        int income = 0;
        for (int i = 0; i < tickets.length; i++) {
            income += tickets[i].getTicketPreis();
        }
        return income;
    }

    public void getLastStopInOut() {
        int lastStop = 0;
        int getIn = 0;
        int getOut = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].getGetOut() < lineLength && tickets[i].getGetOut() > lastStop) {
                lastStop = tickets[i].getGetOut();
            }
        }

        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i].getGetOut() == lastStop) {
                getOut++;
            } else if (tickets[i].getGetIn() == lastStop) {
                getIn++;
            }
        }

        System.out.println("A végállomást megelőzően " + getIn +
                " szálltak fel, és " + getOut + " szálltak le.");
    }



}
