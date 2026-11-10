import java.util.ArrayList;
import java.util.Scanner;

/** Console to-do list tracker. Provided complete; students do not need to edit this file. */
public class TodoAppConsoleVersion {
    private static final ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n1) Add task  2) Show tasks  3) Sort by difficulty"
                    + "  4) Sort by completed  5) Sort by due time  6) Quit");
            System.out.print("Choose: ");
            String choice = in.nextLine().trim();
            try {
                switch (choice) {
                    case "1": addTask(in); break;
                    case "2": show(); break;
                    case "3": sortAndShow(Task::getDifficulty); break;
                    case "4": sortAndShow(Task::getCompleted); break;
                    case "5": sortAndShow(Task::getDueTime); break;
                    case "6": return;
                    default: System.out.println("Please enter 1-6.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }

    private static void addTask(Scanner in) {
        System.out.print("Description: ");
        String desc = in.nextLine();
        System.out.print("Difficulty (easy/medium/hard): ");
        Difficulty diff = new Difficulty(in.nextLine());
        System.out.print("Completed? (yes/no): ");
        Completed done = new Completed(in.nextLine().trim().equalsIgnoreCase("yes"));
        System.out.print("Due month (1-12): ");
        int month = Integer.parseInt(in.nextLine().trim());
        System.out.print("Due day (1-31): ");
        int day = Integer.parseInt(in.nextLine().trim());
        System.out.print("Due time (H:MM, for example 9:30): ");
        String[] hm = in.nextLine().trim().split(":");
        System.out.print("AM or PM: ");
        String amPm = in.nextLine().trim();
        DueTime due = new DueTime(month, day, Integer.parseInt(hm[0]), Integer.parseInt(hm[1]), amPm);
        tasks.add(new Task(desc, diff, done, due));
    }

    private static <K extends Comparable<K>> void sortAndShow(java.util.function.Function<Task, K> key) {
        Task[] arr = tasks.toArray(new Task[0]);
        Sorts.bubbleSortBy(arr, key);
        System.out.println("Sorted:");
        for (Task t : arr) System.out.println("  " + t);
        System.out.println("isSorted check: " + Sorts.isSortedBy(arr, key));
    }

    private static void show() {
        if (tasks.isEmpty()) System.out.println("No tasks yet.");
        for (Task t : tasks) System.out.println("  " + t);
    }
}
