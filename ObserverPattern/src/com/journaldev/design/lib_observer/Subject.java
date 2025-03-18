package com.journaldev.design.lib_observer;

//Subject.java
public interface Subject {
 void registerObserver(Observer observer);
 void removeObserver(Observer observer);
 void notifyObservers(String message);
}
