public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Adding tasks
        taskManager.addTask(1, "Task One", "Pending");
        taskManager.addTask(2, "Task Two", "In Progress");
        taskManager.addTask(3, "Task Three", "Completed");

        // Traversing and printing tasks
        System.out.println("All Tasks:");
        taskManager.traverseTasks();

        // Searching for a task
        Task foundTask = taskManager.searchTask(2);
        if (foundTask != null) {
            System.out.println("Found Task: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        taskManager.deleteTask(2);
        System.out.println("Tasks after deletion:");
        taskManager.traverseTasks();
    }
}