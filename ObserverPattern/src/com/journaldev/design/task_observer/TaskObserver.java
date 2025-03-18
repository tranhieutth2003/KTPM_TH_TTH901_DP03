package com.journaldev.design.task_observer;

public interface TaskObserver {
    void update();
    void setTaskSubject(TaskSubject task);
}
