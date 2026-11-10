/** One item on the to-do list. Provided complete; students do not need to edit this file. */
public class Task {
    private final String description;
    private final Difficulty difficulty;
    private final Completed completed;
    private final DueTime dueTime;

    public Task(String description, Difficulty difficulty, Completed completed, DueTime dueTime) {
        this.description = description;
        this.difficulty = difficulty;
        this.completed = completed;
        this.dueTime = dueTime;
    }

    public String getDescription()  { return description; }
    public Difficulty getDifficulty() { return difficulty; }
    public Completed getCompleted() { return completed; }
    public DueTime getDueTime()     { return dueTime; }

    @Override
    public String toString() {
        return String.format("%-25s | %-6s | %-8s | due %s",
                description, difficulty, completed, dueTime);
    }
}
