import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EventTask extends Task {

    private final LocalDate from;
    private final LocalDate to;

    /**
     * Constructor for Task.
     *
     * @param description of the task.
     */
    public EventTask(String description, String from, String to) {
        super(description);
        // convert date string in the format of yyyy-mm-dd to LocalDate object
        this.from = LocalDate.parse(from);
        // convert LocalDate object to MMM dd yyyy format
        this.to = LocalDate.parse(to);
    }

    public String getFrom() {
        // Format in MMM dd yyyy
        return this.from.format(DateTimeFormatter.ofPattern(Task.DATE_FORMAT));
    }

    public String getTo() {

        return this.to.format(DateTimeFormatter.ofPattern(Task.DATE_FORMAT));
    }

    @Override
    public String getFileDescriptor() {
        return super.getFileDescriptor() + String.format("| %s | %s | %s", this.getFrom(), this.getTo(), "EVENT");
    }

    @Override
    public String toString() {
        return "[E] " + super.toString() + " (from: " + this.getFrom() + " to: " + this.getTo() + ")";
    }
}
