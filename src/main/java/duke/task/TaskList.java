package duke.task;

import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> tasks;

    /**
     * Constructor for TaskList.
     */
    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Constructor for TaskList.
     *
     * @param list list of tasks to initialise the list with.
     */
    public TaskList(ArrayList<Task> list) {
        this.tasks = list;
    }

    /**
     * Adds a task to the list.
     *
     * @param task task to be added.
     */
    public void addTask(Task task) {
        this.tasks.add(task);
    }

    /**
     * Deletes a task from the list.
     *
     * @param index index of the task to be deleted.
     */
    public void deleteTask(int index) {
        this.tasks.remove(index);
    }

    /**
     * Gets a task from the list.
     *
     * @param index index of the task to be retrieved.
     * @return task at the specified index.
     */
    public Task getTask(int index) {
        return this.tasks.get(index);
    }

    /**
     * Marks a task as done.
     *
     * @param index index of the task to be marked.
     */
    public void markTask(int index) {
        this.tasks.get(index).mark();
    }

    /**
     * Unmarks a task as done.
     *
     * @param index index of the task to be unmarked.
     */
    public void unmarkTask(int index) {
        this.tasks.get(index).unmark();
    }


  
    public int size() {
        return this.list.size();
    }

    
    public ArrayList<Task> getList() {
        return this.list;

    /**
     * Returns the size of the list.
     *
     * @return size of the list.
     */
    public int getSize() {
        return this.tasks.size();
    }

    /**
     * Returns the tasks as an ArrayList.
     *
     * @return tasks as an ArrayList.
     */
    public ArrayList<Task> getTasks() {
        return this.tasks;

    }

    /**
     * Returns the list as a string.
     *
     * @return list as a string.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++) {

            sb.append(String.format("%d. %s \n", i + 1, tasks.get(i).toString()));
        }
        return sb.toString();
    }

}
