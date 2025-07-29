import model.Employee;
import model.Task;
import service.TaskService;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("this is correct add task", 10);
        Task task2 = new Task(null, 60);
        Task task3 = new Task("this is negative estimated time task", -50);
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
        TaskService.removeTask(task1);

//
//        List<String> taskList = new ArrayList<>();
//        taskList.add(String.valueOf(task1));
//        taskList.add(String.valueOf(task2));
//        taskList.add(String.valueOf(task3));
//        taskList.add(String.valueOf(task4));
//
//        for (String s : taskList) {
//            System.out.println(s);
//        }
////-------------------------
////        List<Employee> employees = List.of(employee1, employee2, employee3);
////        Set<Task> departments = employees.stream().flatMap(employee ->
////                employee.getEmployeeId().stream()).collect(Collectors.toSet());
////
////        for (Task d : departments) {
////            for (Employee employee : employees) {
////                if (employee.getEmployeeId().contains(d)) {
////                    if (!result.containsKey(d)) {
////                        result.put(d, new ArrayList<Employee>());
////                    }
////                    result.get(d).add(employee);
////                }
////            }
////        }
////        return result;
////--------------------------
//
//        // Creating object for Map.
//        Map<Integer, String> map
//                = new HashMap<Integer, String>();
//
//        // Adding Elements using Map.
//        map.put(employee1.getEmployeeId(), task1.getDescription());
//        map.put(employee2.getEmployeeId(), task2.getDescription());
//        map.put(employee3.getEmployeeId(), task3.getDescription());
//
//        // Elements can traverse in any order
//        for (Map.Entry m : map.entrySet()) {
//            System.out.println(m.getKey() + " "
//                    + m.getValue());
//        }
    }
}


//Maintain a collection of employees and their tasks — use a
//structure with fast lookups and grouping (e.g.,
//Map<EmployeeID, List<Task>>).
// چیزی من فهمیدم از این،
// این بود از دوتا اینترفیس مپ و لیست باید استفاده کنیم
// که داخل لیست کارکنان رو بریزیم
// ، و هر کدومو مپ کنیم به یک تسک
// و اونجا بیایم فیلتر کنیم.
