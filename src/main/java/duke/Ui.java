package duke;

import duke.task.Task;
import duke.task.TaskList;

import java.util.ArrayList;

public class Ui {
    private final String lineSeparator = "____________________________________________________________";

    /**
     * Prints the welcome message.
     */
    public void showWelcomeMessage() {
        String chatbotName = "Gobble Gobble";
        System.out.println(this.lineSeparator + "\n" + "Hello! I'm " + chatbotName + "\n" +
                "What can I do for you?" + "\n" + this.lineSeparator);
    }

    /**
     * Prints the goodbye message.
     */                           
    public void showByeMessage() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    /**
     * Prints the error message.
     *
     * @param message error message.
     */
    public void showError(String message) {
        System.out.println(lineSeparator + "\n" + message + "\n" + lineSeparator);
    }

    /**
     * Prints the task as marked.
     *
     * @param task task to be marked.
     */
    public void showMarkMessage(Task task) {
        System.out.println(this.lineSeparator + "\n" + "Nice! I've marked this task as done:" + "\n" +
                task + "\n" + this.lineSeparator);
    }

    /**
     * Prints the task as unmarked.
     *
     * @param task task to be unmarked.
     */
    public void showUnmarkMessage(Task task) {
        System.out.println(this.lineSeparator + "\n" + "OK, I've marked this task as not done yet:" + "\n" +
                task + "\n" + this.lineSeparator);
    }

    /**
     * Prints the task as deleted.
     *
     * @param task task to be deleted.
     * @param size size of the task list after deletion.
     */
    public void showDeleteMessage(Task task, int size) {
        System.out.println(this.lineSeparator + "\n" + "Noted. I've removed this task:" + "\n"
                + task.getDescription() + "\n" + "Now you have " + (size) + " tasks in the list." + "\n"
                + this.lineSeparator);
    }

    /**
     * Prints the task as added.
     *
     * @param task task to be added.
     * @param size size of the task list after addition.
     */
    public void showAddTaskMessage(Task task, int size) {
        System.out.println(this.lineSeparator + "\n" + "Got it. I've added this task:" + "\n"
                + task.toString() + "\n" + "Now you have " + (size) + " tasks in the list." + "\n"
                + this.lineSeparator);
    }

    /**
     * Prints the task list.
     *
     * @param taskList list of tasks.
     */
    public void showTasks(TaskList taskList) {
        System.out.println(this.lineSeparator);
        System.out.println("Here are the tasks in your list:");
        System.out.println(taskList);
    }

    public void printResultList(ArrayList<Task> list) {
        System.out.println(Duke.lineSeparator);
        System.out.println("Here are the matching tasks in your list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "." + list.get(i));
        }
        System.out.println(Duke.lineSeparator);
    }
}
