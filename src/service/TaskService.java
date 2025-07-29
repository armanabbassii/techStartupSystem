package service;

import exception.InvalidDescription;
import exception.InvalidEstimatedTime;
import model.Task;
import util.DBConnection;

import java.util.Random;
import java.util.Scanner;

public class TaskService {
    static Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    public static void addTask(Task task) {

        try {
            if (task.getDescription() == null) {
                throw new InvalidDescription();
            }
            if (task.getEstimatedTime() < 0) {
                throw new InvalidEstimatedTime();
            }
            int taskid = randomNumber();
            String addTaskQuery = "insert into task(description,estimatedTime, taskid) values(?,?,?)";
            DBConnection.executeLine(addTaskQuery, task.getDescription(), task.getEstimatedTime(), taskid);
            System.out.println("task successfully added. " + "||" + " taskId: " + taskid);

        } catch (InvalidDescription ex) {
            System.out.println("description is not be null");
        } catch (InvalidEstimatedTime ex) {
            System.out.println("EstimatedTime not less than 0");
        }

//question
//        if(task.getEstimatedTime() == null){
//            throw new InvalidEstimatedTime("estimated time not be null");
//        }

    }

    public static void updateTask(Task task) {

        try {
            if (task.getDescription() == null) {
                throw new InvalidDescription();
            }
            if (task.getEstimatedTime() < 0) {
                throw new InvalidEstimatedTime();
            }

            System.out.println("please enter taskid: ");
            int taskid = myObj.nextInt();
            String updateTaskQuery = "UPDATE task SET description = ?, estimatedTime = ? WHERE taskid = ?";
            DBConnection.executeLine(updateTaskQuery, task.getDescription(), task.getEstimatedTime(), taskid);
            System.out.println("task successfully updated");

        } catch (InvalidDescription ex) {
            System.out.println("description is not be null");
        } catch (InvalidEstimatedTime ex) {
            System.out.println("EstimatedTime not less than 0");
        }
    }

    public static void removeTask(Task task) {
        System.out.println("please enter taskid: ");
        int taskid = myObj.nextInt();
        String removeTaskQuery = "delete from task where taskid = ?";
        DBConnection.executeLine(removeTaskQuery, taskid);
        System.out.println("task successfully deleted");
    }

    public static int randomNumber() {
        Random random = new Random();
        int number;
        number = random.nextInt(1000, 2000);
        return number;
    }
}
