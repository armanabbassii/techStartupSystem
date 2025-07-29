import model.Employee;
import model.Task;
import service.TaskService;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("this is correct add task", 10);
        Task task2 = new Task("this is null task", 6);
        Task task3 = new Task("this is negative estimated time task", 50);
        Task task4 = new Task("this is correct update task", 99);

        Employee employee1 = new Employee(1, "Arman");
        Employee employee2 = new Employee(2, "Ali");
        Employee employee3 = new Employee(3, "Zahra");


        //addTask method
        TaskService.addTask(task1);
        TaskService.addTask(task2);
        TaskService.addTask(task3);

        //updateTask method
        TaskService.updateTask(task1);

        //removeTask method
//        TaskService.removeTask(task1);

        Map<Integer, List<Task>> employeeTask = new HashMap<>();
        employeeTask.put(employee1.getEmployeeId(), new ArrayList<>(Arrays.asList(task1, task4)));
        employeeTask.put(employee2.getEmployeeId(), new ArrayList<>(List.of(task2)));
        employeeTask.put(employee3.getEmployeeId(), new ArrayList<>(List.of(task3)));
        for (Map.Entry<Integer, List<Task>> m : employeeTask.entrySet()) {
            Integer employeeId = m.getKey();
            List<Task> tasks = m.getValue();
            System.out.println("emloyeeId:" + employeeId);
            for (Task task : tasks) {
                System.out.println(
                        "Description: " + task.getDescription() +
                                ", Estimated Time: " + task.getEstimatedTime());
            }
        }
        System.out.println("-------------------");
        employeeTask.entrySet().stream().flatMap(entry -> entry.getValue().stream().map(task -> "employeeId: " + entry.getKey() + " taskId: " + task.getTaskId() + " description: " + task.getDescription() + "estimateTime: " + task.getEstimatedTime())).forEach(System.out::println);
        System.out.println("-------------------");


        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);

//taskId? how?
        System.out.println("-------------------");
        for (Task task : taskList) {
            System.out.println("Description: " + task.getDescription() + ", Estimated Time: " + task.getEstimatedTime());
        }
        System.out.println("-------------------");

        List<Task> filter = taskList.stream()
                .filter(x -> x.getEstimatedTime() > 10)
                .toList();
        System.out.println(filter);

        System.out.println("\nTasks with estimatedTime > 10:");
        for (Task task : filter) {
            System.out.println("Description: " + task.getDescription() + ", Estimated Time: " + task.getEstimatedTime());
        }
    }
}
