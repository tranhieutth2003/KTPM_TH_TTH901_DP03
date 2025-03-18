package com.journaldev.design.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Tạo subject
        MyTopic topic = new MyTopic();

        // Tạo observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        // Đăng ký observers vào subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        // Gắn subject cho observer
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        // Kiểm tra xem có cập nhật gì không
        obj1.update();

        // Gửi thông điệp tới subject
        topic.postMessage("New Message");
    }
}
