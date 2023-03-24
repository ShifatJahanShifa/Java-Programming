public class Time2 {
    private int hour;
    private int minute;
    private int second;

    // constructor
    public Time2(int hour,int minute,int second)
    {
        if(hour<0 || hour>23)
            throw new IllegalArgumentException("hour must be between 0 and 23");
        if (minute<0 || minute>59)
            throw new IllegalArgumentException("minute must be between 0 and 59");
        if (second<0 || second>59)
            throw new IllegalArgumentException("second must be between 0 and 59");

        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    // getter methods
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }
    public int getSecond()
    {
        return second;
    }
}
