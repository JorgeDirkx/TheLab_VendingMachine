package com.jorgedirkx;

public class Stock {

    private Can[] cans;

    public Stock(int amount) {
        this.initStock(amount);
    }

    //init value setter
    public void initStock(int amount) {
        Can[] canOptions = Can.values();
        cans = new Can[amount * canOptions.length];
        int index = 0;
        for (Can canOption : canOptions) {
            for (int j = 0; j < amount; j++) {
                cans[index] = canOption;
                index++;
            }
        }
    }

    public boolean checkStock(Can can) {
        for (Can value : this.cans) {
            if (can.equals(value)) {
                return true;
            }
        }
        return false;
    }

    //giving a can output
    public Can giveCan(Can can) {
        if (can != null && this.checkStock(can)) {
            for (int i = 0; i < this.cans.length; i++) {
                if (can.equals(cans[i])) {
                    this.cans[i] = null;
                    break;
                }
            }
            System.out.println("dispending" + can.name());
            return can;
        } else {
            System.out.println("can out of stock");
            return null;
        }
    }
}

