package com.designpattern.observers;

import com.designpattern.subject.StockSubject;

public class StockObserverImpl implements Observer{

    private StockSubject stockSubject;

    private int observerID;

    private static int observerIDTracker = 0;


    public StockObserverImpl(StockSubject stockSubject) {

        this.stockSubject = stockSubject;

        observerID = ++observerIDTracker;

        stockSubject.register(this);

        System.out.println("New Observer: " + observerID);

    }

    @Override
    public void updatePrice(double stockAPrice, double stockBPrice) {

        System.out.println("observerID: " +  observerID+ ",  stockAPrice: "+ stockAPrice);
        System.out.println("observerID: " +  observerID+ ",  stockBPrice: "+ stockBPrice);

    }
}
