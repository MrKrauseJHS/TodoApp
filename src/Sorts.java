import java.util.function.Function;

/** Sorting utilities. Students finish the TODO methods. */
public class Sorts {

    // ---- Provided helpers (from the lecture) ----

    /** Is v less than w? */
    public static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    /** Swap a[i] and a[j]. */
    public static <T> void exchange(T[] a, int i, int j) {
        T swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // ---- TODO methods ----

    /**
     * TODO: Return true if a is in nondecreasing (ascending) order.
     * Use only less(). An empty array or one with a single item is sorted.
     */
    public static <T extends Comparable<T>> boolean isSorted(T[] a) {
        throw new UnsupportedOperationException("TODO: implement isSorted");
    }

    /**
     * TODO: Return true if the tasks are in nondecreasing order of the property
     * returned by key. Example: isSortedBy(tasks, Task::getDifficulty)
     * Hint: apply key.apply(task) to get the property, then compare with less().
     */
    public static <T, K extends Comparable<K>> boolean isSortedBy(T[] a, Function<T, K> key) {
        throw new UnsupportedOperationException("TODO: implement isSortedBy");
    }

    /**
     * TODO: Bubble sort a into ascending order by the property returned by key.
     * Example: bubbleSortBy(tasks, Task::getDueTime)
     * Rules:
     *   - Compare using less() on the property (so it uses your compareTo methods).
     *   - Move items only with exchange().
     *   - Repeatedly step through the array swapping adjacent items that are out of order.
     *     Stop early if a full pass makes no swaps.
     */
    public static <T, K extends Comparable<K>> void bubbleSortBy(T[] a, Function<T, K> key) {
        throw new UnsupportedOperationException("TODO: implement bubbleSortBy");
    }
}
