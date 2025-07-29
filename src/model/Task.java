package model;

public class Task {
    private String description;
    private double estimatedTime;
    private int taskId;

    public Task(String description, double estimatedTime) {
        this.description = description;
        this.estimatedTime = estimatedTime;
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public double getEstimatedTime() {
        return estimatedTime;
    }
    public int getTaskId(){
        return taskId;
    }
}
