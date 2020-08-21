package com.jorgedirkx;

import java.util.Scanner;

public class MachineSelection {

    private Scanner kbd = new Scanner(System.in);

    //asking input
    public int getChoice(){
        System.out.println("make your selection");
        int choice = kbd.nextInt();
        while (choice<1 || choice>3){
            System.out.println("not an option try again");
            choice = kbd.nextInt();

        }
        return choice;
    }
}
