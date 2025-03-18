package com.journaldev.design.task_observer;

public class TeamMember implements TaskObserver {
    private String name;
    private TaskSubject taskSubject;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String status = taskSubject.getUpdate(this);
        if (status == null) {
            System.out.println(name + ": No new task status updates.");
        } else {
            System.out.println(name + ": Task status updated to: " + status);
        }
    }

    @Override
    public void setTaskSubject(TaskSubject task) {
        this.taskSubject = task;
    }
}
