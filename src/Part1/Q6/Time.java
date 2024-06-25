package Part1.Q6;

import java.util.Date;
import java.util.TimeZone;

public class Time {

    private int hour;
    private int minute;
    private int second;

    // No-arg constructor for current time in GMT
    public Time() {
        //To get current time in milliseconds
        long currentTimeMillis = System.currentTimeMillis();

        // Create a Date object based on current time
        Date currentDate = new Date(currentTimeMillis);

        // Create a calendar with GMT time zone
        java.util.Calendar calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.setTime(currentDate);

        this.hour = calendar.get(java.util.Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(java.util.Calendar.MINUTE);
        this.second = calendar.get(java.util.Calendar.SECOND);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Time currentTime = new Time();

        // Show hour, minute, and second using get methods
        System.out.println("Current Time (GMT):");
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());
    }
}
