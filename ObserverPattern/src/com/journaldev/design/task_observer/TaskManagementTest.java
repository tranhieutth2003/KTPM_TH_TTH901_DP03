package com.journaldev.design.task_observer;

public class TaskManagementTest {
    public static void main(String[] args) {
        // Tạo công việc
        Task task = new Task();
        
        // Tạo các thành viên trong nhóm
        TaskObserver member1 = new TeamMember("Alice");
        TaskObserver member2 = new TeamMember("Bob");
        TaskObserver member3 = new TeamMember("Charlie");

        // Đăng ký các thành viên vào task
        task.registerObserver(member1);
        task.registerObserver(member2);
        task.registerObserver(member3);

        // Gắn task cho các thành viên
        member1.setTaskSubject(task);
        member2.setTaskSubject(task);
        member3.setTaskSubject(task);

        // Cập nhật trạng thái công việc và thông báo cho các thành viên
        task.setStatus("In Progress");
        task.setStatus("Completed");
    }
}
