
package calendar;

public class CalendarDay implements Comparable<Object>
{
    private int day;
    private int month;
    private int year;
    private LinkedList events;

    public CalendarDay(int day, int month, int year) 
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int compareTo(Object CalendarDay)
    {
        return 5;
    }
    
    @Override
    public String toString()
    {
        return "CalendarDay{" + "day=" + day + ", month=" + month + ", year=" + year + ", events=" + events + '}';
    }
    
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LinkedList getEvents() {
        return events;
    }

    public void setEvents(LinkedList events) {
        this.events = events;
    }
    
    
    
}
