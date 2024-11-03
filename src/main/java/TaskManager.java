import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    // Agregar una nueva tarea
    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
    }

    // Eliminar una tarea por su índice
    public boolean removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            return true;
        }
        return false;
    }

    // Marcar una tarea como completada por su índice
    public boolean completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
            return true;
        }
        return false;
    }

    // Obtener la lista de tareas
    public List<Task> getTasks() {
        return tasks;
    }


}

