package com.jorgedirkx;

import java.time.LocalDateTime;
import java.util.Formatter;

public class Ticket {

    private Formatter f = new Formatter();
    private Can can;
    private LocalDateTime date;
    private double price;

    public Ticket(Can can) {
        this.can =can;
        this.price=can.getCost();
        date = LocalDateTime.now();
    }

    public void printingTicket(){
        System.out.printf("purchase at %02d", this.date.getDayOfMonth());
    }
}
