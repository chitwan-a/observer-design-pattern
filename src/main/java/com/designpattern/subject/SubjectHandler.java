package com.designpattern.subject;


import com.designpattern.observers.Observer;

public interface SubjectHandler {
    public void register(Observer o);

    public void unregister(Observer o);

    public void notifyObserver();

}
