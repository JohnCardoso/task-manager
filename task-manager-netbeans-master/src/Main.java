import task.TaskManager;
import view.AddTask;
import view.ViewTaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManger = new TaskManager();
        
        AddTask addTask = new AddTask(taskManger);
        
        addTask.setVisible(true);
    }
}