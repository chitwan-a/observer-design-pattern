package com.designpattern.subject;

import com.designpattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockSubject implements SubjectHandler {

    private double stockAPrice;
    private double stockBPrice;

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.updatePrice(stockAPrice, stockBPrice));
    }

    public void setStockAPrice(double stockAPrice) {
        this.stockAPrice = stockAPrice;
        notifyObserver();
    }

    public void setStockBPrice(double stockBPrice) {
        this.stockBPrice = stockBPrice;
        notifyObserver();
    }
}
