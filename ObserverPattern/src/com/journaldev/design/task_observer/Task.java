package com.journaldev.design.task_observer;

import java.util.ArrayList;
import java.util.List;

public class Task implements TaskSubject {
    private List<TaskObserver> observers;
    private String status;
    
    public Task() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(TaskObserver observer) {
        if (observer == null) throw new NullPointerException("Null Observer");
        observers.add(observer);
    }

    @Override
    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate(TaskObserver observer) {
        return this.status;
    }

    // Phương thức để cập nhật trạng thái công việc
    public void setStatus(String status) {
        this.status = status;
        System.out.println("Task status updated to: " + status);
        notifyObservers();
    }
}

