package task;

import java.util.Date;
import java.util.Random;

public class Task {
    private int id;
    private String title, description, priority, status;
    private Date createDate;

    public Task(String title, String description, String priority, String status) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.createDate = new Date();
        this.status = status;
        
        Random randomGenerator = new Random();
        
        this.id = randomGenerator.nextInt(100);
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPriority() {
        return this.priority;
    }

    public String getStatus() {
        return this.status;
    }
    
    public String toString() {
        return new Integer(id).toString() + " @ " + this.getTitle() + " - " + this.getPriority() + " - " + this.getStatus();
    }
}