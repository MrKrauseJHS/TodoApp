/** A due time: month (1-12), day (1-31), hour (0-23), minute (0-59). Earlier comes first. */
public class DueTime implements Comparable<DueTime> {
    private final int month, day, hour, minute;

    public DueTime(int month, int day, int hour, int minute) {
        if (month < 1 || month > 12) throw new IllegalArgumentException("month must be 1-12");
        if (day < 1 || day > 31) throw new IllegalArgumentException("day must be 1-31");
        if (hour < 0 || hour > 23) throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute > 59) throw new IllegalArgumentException("minute must be 0-59");
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public int getMonth()  { return month; }
    public int getDay()    { return day; }
    public int getHour()   { return hour; }
    public int getMinute() { return minute; }

    /**
     * TODO: Compare this due time to other, earlier = smaller.
     * Check month first, then day, then hour, then minute (just like the Date example in the video).
     * Return -1 / 0 / +1 (or any negative / 0 / positive).
     * Throw NullPointerException if other is null.
     */
    @Override
    public int compareTo(DueTime other) {
        throw new UnsupportedOperationException("TODO: implement DueTime.compareTo");
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d %02d:%02d", month, day, hour, minute);
    }
}
