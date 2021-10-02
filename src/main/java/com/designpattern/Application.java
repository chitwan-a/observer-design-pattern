package com.designpattern;

import com.designpattern.observers.Observer;
import com.designpattern.observers.StockObserverImpl;
import com.designpattern.subject.StockSubject;

public class Application {

    public static void main(String[] args) {

        StockSubject subject = new StockSubject();

        Observer observer1 = new StockObserverImpl(subject);

        Observer observer2 = new StockObserverImpl(subject);

        subject.setStockAPrice(50.0);

        subject.setStockBPrice(60.0);
    }
}
