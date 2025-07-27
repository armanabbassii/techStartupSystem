package service;

import exception.InvalidDescription;
import exception.InvalidEstimatedTime;
import model.Task;
import util.DBConnection;

public class TaskService {

    public static void addTask(Task task) {
        if (task.getDescription() == null) {
            throw new InvalidDescription("description in not be null");
        }
        if (task.getEstimatedTime() < 0) {
            throw new InvalidEstimatedTime("Estimate time must be greater that 0");
        }

        String addTaskQuery = "insert into(description,estimatedTime) values(?,?)";
        DBConnection.executeLine(addTaskQuery, task.getDescription(), task.getEstimatedTime());
        System.out.println("task successfully added");
    }
    public static void updateTask(Task task){
        if(task.getDescription() == null){
            throw new InvalidDescription("description in not be null");
        }
        if(task.getEstimatedTime() < 0){
            throw new InvalidEstimatedTime("Estimate time must be greater that 0");
        }
        String updateTaskQuery = "update task set(description,estimatedTime) values (?,?)";
        DBConnection.executeLine(updateTaskQuery, task.getDescription(), task.getEstimatedTime());
        System.out.println("task successfully updated");
    }
    public static void removeTask(Task task){
        String removeTaskQuery = "delete from task where id = ?";
        DBConnection.executeLine(removeTaskQuery, task.getDescription(), task.getEstimatedTime());
        System.out.println("task successfully deleted");
    }
}
