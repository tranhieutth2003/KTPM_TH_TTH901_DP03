package com.journaldev.design.observer;

public interface Subject {
    // Các phương thức để đăng ký và hủy đăng ký observer
    public void register(Observer obj);
    public void unregister(Observer obj);
    
    // Phương thức để thông báo các observer về sự thay đổi
    public void notifyObservers();
    
    // Phương thức để lấy dữ liệu từ subject
    public Object getUpdate(Observer obj);
}
