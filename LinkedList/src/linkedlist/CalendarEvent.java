
package linkedlist;

public class CalendarEvent implements Comparable<CalendarEvent> {
    private int startTime;
    private int endTime;
    private String eventName;
    private String location;
    private String description;

    public CalendarEvent(int startTime, int endTime, String eventName, String location, String description) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.eventName = eventName;
        this.location = location;
        this.description = description;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(CalendarEvent o) {
        if(this.endTime < o.startTime)
            return -1;
        else if(o.endTime < this.startTime)
            return 1;
        return 1;
    }
}
