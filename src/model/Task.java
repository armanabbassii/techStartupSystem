package model;

public class Task {
    private String description;
    private double estimatedTime;

    public Task(String description, double estimatedTime) {
        this.description = description;
        this.estimatedTime = estimatedTime;
    }

    public String getDescription() {
        return description;
    }

    public double getEstimatedTime() {
        return estimatedTime;
    }
}
