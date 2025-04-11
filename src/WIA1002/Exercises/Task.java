package WIA1002.Exercises;

import java.util.ArrayList;

enum Priority {
    Low,
    Medium,
    High
}

enum Status {
    ToDo,
    InProgress,
    Done
}

public class Task {
    private String title;
    private String description;
    private Priority priority;
    private Status status;

    // Get task title
    // Get task description
    // Get task priority
    // Get task status

    // Set task title
    // Set task description
    // Set task priority
    // Set task status

}

interface TasksProps {
    /**
     * Add a new task
     * 
     * @return boolean (that task has been added or not)
     */
    public boolean addTask();

    /**
     * Remove a new task
     * 
     * @return boolean (that task has been removed or not)
     */
    public boolean removeTask();

    /**
     * Update an existing task's info
     * 
     * @return Task info
     */
    public boolean updateTask();
}

class TaskList {
    ArrayList<Task> tasklist = new ArrayList<>();
    // Add new Task
    // Remove Task
    // Update Task's Info
}

class Main {
    // Call TaskList object

    // Add new Task (addNewTask)
    // Remove an existing Task (@removeTask)
    // Update an existing Task's Info (@updateTask)
}
