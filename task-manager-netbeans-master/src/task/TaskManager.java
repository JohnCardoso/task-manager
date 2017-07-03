package task;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class TaskManager {
    private List<Task> tasks;
    private List<Task> filteredTasks;

    public TaskManager() {
        this.tasks = new ArrayList<Task>();
    }
    
    public DefaultListModel transformToModel() {
        DefaultListModel<Task> model = new DefaultListModel<Task>();
                
        for (int i = 0; i < this.tasks.size(); i++) {
            model.addElement(this.tasks.get(i));
        }
        
        return model;
    }
    
    public DefaultListModel filterByPriority(String priority) {
        DefaultListModel<Task> model = new DefaultListModel<Task>();
        
        for (int i = 0; i < this.tasks.size(); i++) {
            if (this.tasks.get(i).getPriority().equals(priority)) {
                 model.addElement(this.tasks.get(i));
            }
        }
        
        return model;
    }
    
    public DefaultListModel filterByStatus(String status) {
        DefaultListModel<Task> model = new DefaultListModel<Task>();
        
        for (int i = 0; i < this.tasks.size(); i++) {
            if (this.tasks.get(i).getStatus().equals(status)) {
                 model.addElement(this.tasks.get(i));
            }
        }
        
        return model;
    }
    
    public void add(Task task) {
        this.tasks.add(task);
    }

    public void remove(Task task) {
        if (this.tasks.contains(task)) {
            this.tasks.remove(task);
        }
    }

    public List<Task> list() {
        return this.tasks;
    }

    public int listSize() {
        return this.tasks.size();
    }
}
