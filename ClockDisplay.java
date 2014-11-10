
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your marcelino) 
 * @version (2014/11/10)
 */
public class ClockDisplay
{
    // variable for hours
    private int hour;
    // variable for minutes
    private int minute;
  
    

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        hour = 0;
        minute = 0;
    }
    
    /**
     * set time to 23:45
     */
    public void setTime()
    {
        hour = 23;
        minute = 45;
    }
    
    /**
     *  advance one minute
     */
    public void timeTick()
    {
        if (minute == 59)
        {
            if (hour == 23)
            {
            hour = 0;
            minute = 0;
        }
        else
        {
            hour = hour +1;
            minute = 0;
        }
        }
        else
        {
            minute = minute + 1;
        }
    
    }
    
  
}
