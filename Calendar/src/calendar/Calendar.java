package calendar;
import java.util.Scanner;


import java.util.Scanner;

public class Calendar extends LinkedList
{
    private String FirstName;
    private String LastName;
    private LinkedList theCalendar;

    public Calendar(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
        theCalendar = new LinkedList();
    }
    
    private void printIntro(){
        
    }
    
    public void populate(Scanner myScan){
        System.out.println("===========================================================\nEnter a new Calendar Event in the following example format:\n1100 1300 6 28 2016\nLunch with the family\nCici Pizza\nMeeting my wife and kids for lunch\n===========================================================\nENTER -1 TO QUIT AND PRINT CALENDAR\n");
        while (true){
            int st_time = myScan.nextInt();
            if (st_time == -1)
                break;
            int end_time = myScan.nextInt();
            
            int month = myScan.nextInt();
            int day   = myScan.nextInt();
            int year  = myScan.nextInt();
            myScan.next();
            String EventName   = myScan.nextLine();
            String Location    = myScan.nextLine();
            String Description = myScan.nextLine();
            
            CalendarEvent ce = new CalendarEvent(st_time,end_time,EventName,Location,Description);

            CalendarDay cd = new CalendarDay(day,month,year);
            if (theCalendar.find(cd) != null){
                CalendarDay temp = (CalendarDay) theCalendar.find(cd);
                temp.getEvents().insert(ce);
            }
            else{
                cd.getEvents().insert(ce);
                theCalendar.insert(cd);
            }
        }
    }
    
    private boolean validate(CalendarDay calendarDay)
    {
        return true;
    }
    
    public void remove(int StartTime, int month, int day, int year){
        
    }
    
//    public CalendarDay find(CalendarDay)
//    {
//        return CalendarDay;
//    }
    
    public String DayToString(int day, int month, int year){
        String s = "===========================================================\n";
        CalendarDay cd = new CalendarDay(day,month,year);
        CalendarDay res = (CalendarDay) theCalendar.find(cd);
        if (res != null){
            s += res.toString();
        }
        else{
            s += "Nothing to do on this day!\n";
        }
        s += "===========================================================\n\n";
        return s;
    }
    
    public String toString(){
        String s = "===========================================================\nSebastian van Delden's Calendar:\n\n";
        s += theCalendar.toString();
        return s;
    }
    
    public String getFirstName()
    {
        return FirstName;
    }

    public void setFirstName(String FirstName)
    {
        this.FirstName = FirstName;
    }

    public String getLastName()
    {
        return LastName;
    }

    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }

    public LinkedList getTheCalendar()
    {
        return theCalendar;
    }

    public void setTheCalendar(LinkedList theCalendar)
    {
        this.theCalendar = theCalendar;
    }
    
    
    
}
