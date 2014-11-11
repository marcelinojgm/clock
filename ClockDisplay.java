
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
     * introducir un numero entero entre 0-23 para newHour
     * introducir un numero entero entre 0-59 para newMinute
     * en caso contrario se inicializaran a cero
     */
    public ClockDisplay(int newHour, int newMinute)
    {
        if(newHour>=0)
        {
            if(newHour<=23)
            {
                hour = newHour;
            }
            else 
            {
                hour = 0;
            }
        }
        else
        {
            hour = 0;
        }
        
        if(newMinute>=0)
        {
            if(newMinute<=23)
            {
                minute = newMinute;
            }
            else 
            {
                minute = 0;
            }
        }
        else
        {
            minute = 0;
        }
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
    
    /**
     * print hour format HH:MM
     */
    public String getTime()
    {
        String curentTime;
        if (hour < 10)
        {
            curentTime = "0" + hour + ":";
        }
        else
        {
            curentTime = hour + ":";
        }
        if(minute < 10)
        {
            curentTime = curentTime + "0" + minute;
        }
        else
        {
            curentTime = curentTime + minute;
        }
        return curentTime;
    }
}
