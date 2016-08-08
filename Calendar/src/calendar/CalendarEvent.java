
package calendar;
import java.lang.Comparable;
import java.util.*;

public class CalendarEvent implements Comparable<Object>
{
    private int StartTime;
    private int EndTime;
    private String EventName;
    private String Location;
    private String Description;
    
    public CalendarEvent(int StartTime, int EndTime, String EventName, String Location, String Description)
    {
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.EventName = EventName;
        this.Location = Location;
        this.Description = Description; 
    }
    
    public int compareTo(Object CalendarEvent)
    {
        CalendarEvent testEvent1 = new CalendarEvent(StartTime, EndTime, EventName, Location, Description); //test
        CalendarEvent testEvent2 = new CalendarEvent(StartTime, EndTime, EventName, Location, Description);//test
        testEvent1.StartTime = 1000;//test
        testEvent1.EndTime = 1100;//test
        testEvent2.StartTime = 1101;//test
        testEvent2.EndTime = 1200;//test
        int result;//test
        
        
        
        if((testEvent2.EndTime < testEvent1.StartTime) || !(testEvent2.StartTime > testEvent1.EndTime))
           {
               System.out.println(0);//test
               System.out.println("they overlap");//test
               result = 0;
               return result;
           }
        else
        {
            result = -1;
            System.out.println(-1);//test
            System.out.println("they don't overlap");//test
            return result;
        }
    }

    public String toString()
    {
        
        return new String();
    }
    
    public int getStartTime() {
        return StartTime;
    }

    public void setStartTime(int StartTime) {
        this.StartTime = StartTime;
    }

    public int getEndTime() {
        return EndTime;
    }

    public void setEndTime(int EndTime) {
        this.EndTime = EndTime;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    
}
