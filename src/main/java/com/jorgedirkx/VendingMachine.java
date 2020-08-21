package com.jorgedirkx;

public class VendingMachine {

    private int iD;
    private Stock stock;
    private Register register;

    public VendingMachine(){
        iD = 43940;
        stock = new Stock(5);
        register = new Register(5 * Can.values().length);
    }

    public void giveMenu(){
        Can[]canOptions = Can.values();
        for (Can canOption:canOptions){
            System.out.println((canOption.ordinal()+1) + "." + canOption.name()+":" + canOption.getCost());
        }
    }

    public void printReciept(){
        register.printTickets();
    }

    //getting choice
    public Can getChoice (int choice) {
        Can[] canOptions = Can.values();
        if (stock.checkStock(canOptions[choice - 1])) {
            register.addTicket(canOptions[choice - 1]);
            return stock.giveCan(canOptions[choice - 1]);
        } else {
            return null;
        }
    }
}
