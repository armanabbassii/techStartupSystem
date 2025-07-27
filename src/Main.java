import model.Task;
import service.TaskService;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("this is correct add task", 10);
        Task task2 = new Task(null, 60);
        Task task3 = new Task("this is negative estimated time task", -50);
        Task task4 = new Task("this is correct update task", 99);

        //addTask method
        TaskService.addTask(task1);
        TaskService.addTask(task2);
        TaskService.addTask(task4);

        //updateTask method
        TaskService.updateTask(task4);
        TaskService.updateTask(task2);
        TaskService.updateTask(task3);

        //removeTask method
        TaskService.removeTask(task1);

    }
}
