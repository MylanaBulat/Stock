package com.study;

public class TestStock {

    public static void main(String[] args){

        Stock stock = new Stock("LKSS", "Limerick Software Solutions");
        stock.setPreviousClosingPrice(79.45);
        stock.setCurrentPrice(79.65);

        String name = stock.getName();
        System.out.println(name);

        double percentage = stock.getChangePercent();
        System.out.printf("the percentage change in the price from previous day to current time = %3.2f%%", percentage);

    }
}
