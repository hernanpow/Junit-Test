import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {
    private TaskManager taskManager;

    @BeforeEach
    public void setUp() {
        taskManager = new TaskManager();
    }

    @Test
    public void testAddTask() {
        taskManager.addTask("Tarea de prueba");
        assertEquals(1, taskManager.getTasks().size());
        assertEquals("Tarea de prueba", taskManager.getTasks().get(0).getDescription());
    }

    @Test
    public void testRemoveTask() {
        taskManager.addTask("Tarea de prueba");
        boolean result = taskManager.removeTask(0);
        assertTrue(result);
        assertEquals(0, taskManager.getTasks().size());
    }

    @Test
    public void testRemoveTaskInvalidIndex() {
        boolean result = taskManager.removeTask(10);
        assertFalse(result);
    }

    @Test
    public void testCompleteTask() {
        taskManager.addTask("Tarea de prueba");
        boolean result = taskManager.completeTask(0);
        assertTrue(result);
        assertTrue(taskManager.getTasks().get(0).isCompleted());
    }

    @Test
    public void testCompleteTaskInvalidIndex() {
        boolean result = taskManager.completeTask(10);
        assertFalse(result);
    }
}
