package com.jorgedirkx;

public class Register {

    private double totalMoney = 0;
    private int ticketCount = 0;
    private Ticket[]tickets;

    Register(int amount){
        tickets = new Ticket[amount];
    }

    public void addTicket(Can can){
        this.tickets[ticketCount++]=new Ticket(can); //new ticket is being made and will be put on next place in array
        this.totalMoney += can.getCost();
    }

    public void printTickets(){
        for(Ticket t: tickets){
            if(t!=null){
                t.printingTicket();
            }
        }
        System.out.printf("%nCans sold for a total of %.2f€", totalMoney);
    }
}
