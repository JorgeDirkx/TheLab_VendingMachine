package com.jorgedirkx;

public class App {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        int choice;
        MachineSelection kb = new MachineSelection();

        vm.giveMenu();

        for (int i = 0; i<5 ; i++){
            choice =kb.getChoice();
            vm.getChoice(choice);
        }
        vm.printReciept();
    }
}
