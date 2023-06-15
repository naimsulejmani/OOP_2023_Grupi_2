package moster_provimi;

public class DataKoha {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int seconds;


    public DataKoha(int year, int month, int day) {
        this(year, month, day, 0, 0, 0);
    }

    public DataKoha(int year, int month, int day, int hour, int minute, int seconds) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    // Getters setters
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String toString() {
        return String.format("%d/%d/%d %d:%d:%d", day, month, year, hour, minute, seconds);
    }

}
