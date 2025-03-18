package com.journaldev.design.task_observer;

public interface TaskSubject {
    void registerObserver(TaskObserver observer);
    void removeObserver(TaskObserver observer);
    void notifyObservers();
    String getUpdate(TaskObserver observer);
}

