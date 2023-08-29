package duke.task;

import java.util.ArrayList;

public class TaskList {
    private final ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public TaskList(ArrayList<Task> list) {
        this.tasks = list;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void deleteTask(int index) {
        this.tasks.remove(index);
    }

    public Task getTask(int index) {
        return this.tasks.get(index);
    }

    public void markTask(int index) {
        this.tasks.get(index).mark();
    }

    public void unmarkTask(int index) {
        this.tasks.get(index).unmark();
    }



    /**
     * Returns an ArrayList of tasks that contains the keyword
     * being searched.
     *
     * @param keyword keyword to be searched for in the description.
     * @return ArrayList of tasks that contains the keyword.
     */
    public ArrayList<Task> findTask(String keyword) {
        ArrayList<Task> result = new ArrayList<>();
        for (Task task : this.list) {
            if (task.getDescription().contains(keyword)) {
                result.add(task);
            }
        }
        return result;
    }

    public int getSize() {
        return this.tasks.size();
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tasks.size(); i++) {

            sb.append(String.format("%d. %s \n", i + 1, tasks.get(i).toString()));
        }
        return sb.toString();
    }

}
