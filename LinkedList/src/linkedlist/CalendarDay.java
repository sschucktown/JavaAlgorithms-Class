/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Scott
 */
import java.util.Calendar;
import java.util.Date;

/**
 * Created by kundan on 16/07/16.
 */
public class CalendarDay implements Comparable<CalendarDay> {
    private int day;
    private int month;
    private int year;
    LinkedList<CalendarEvent> events;

    public CalendarDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(CalendarDay o) {
        Date d = new Date(year,month,day);
        Date d1 = new Date(o.year,o.month,o.year);
        return d.compareTo(d1);
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

    public LinkedList<CalendarEvent> getEvents() {
        return events;
    }

    public void setEvents(LinkedList<CalendarEvent> events) {
        this.events = events;
    }
}
