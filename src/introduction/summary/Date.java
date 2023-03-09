package introduction.summary;

public class Date {
    private int day = 1;
    private int month = 1;
    private int year = 1900;

    public Date() {
        //default constructori
    }

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2100) this.year = year;
    }

    public String toString() {
        return String.format("%d.%d.%d", day, month, year);
    }
}








