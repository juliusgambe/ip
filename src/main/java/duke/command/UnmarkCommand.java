package duke.command;

import duke.Storage;
import duke.Ui;
import duke.task.TaskList;

public class UnmarkCommand extends Command {
    private final int index;

    /**
     * Constructor for UnmarkCommand.
     *
     * @param index of the task to be unmarked.
     */
    public UnmarkCommand(int index) {
        this.index = index;
    }

    /**
     * Unmarks a task as done and displays it as undone.
     *
     * @param taskList list of tasks
     * @param ui       user interface
     * @param storage  storage
     */
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        taskList.unmarkTask(index);
        ui.unmark(taskList.getTask(index));
        storage.saveListToDisk(taskList.getList());
    }
}
