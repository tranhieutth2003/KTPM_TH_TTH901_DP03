package com.journaldev.design.observer;

public interface Observer {
    // Phương thức để cập nhật observer, được gọi bởi subject
    public void update();
    
    // Phương thức để gắn subject vào observer
    public void setSubject(Subject sub);
}
