import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Program to test the Time class

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter time1 (hour minute second): ");
        // Create a new Time object for time1
        long hours = input.nextLong();
        long minutes = input.nextLong();
        long seconds = input.nextLong();
        Time time1 = new Time(hours, minutes, seconds);
        // Print out results for time1
        System.out.println(time1.toString());
        System.out.println("Elasped seconds in time1: " + time1.getSeconds());
        // Create a new Time object for time2
        System.out.println("Enter time2 (elasped time): ");
        long elasped_time = input.nextLong();
        Time time2 = new Time(elasped_time);
        // Print out results for time2
        System.out.println(time2.toString());
        System.out.println("Elasped seconds in time2: " + time2.getSeconds());
        // Compare time1 and time2
        System.out.println("time1.compareTo(time2)? " + time1.compareTo(time2));
        // Clone and compare time1
        Time time3 = (Time)time1.clone();
        System.out.println("time3 is created as a clone of time1");
        System.out.println("time1.compareTo(time3)? " + time1.compareTo(time3));
    }
}
class Time implements Cloneable, Comparable<Time> {
    // data fields
    private long time; // time in seconds since epoch
    // constructors
    Time () {
        time = System.currentTimeMillis() / 1000L;
    }
    Time (long newTime) {
        time = newTime;
    }
    Time (long hours, long minutes, long seconds) {
        time = seconds + (minutes * 60) + (hours * 60 * 60);
    }
    // get the current hour
    public long getHour() {
        return Math.floorDiv(time, 3600);
    }
    // get the current minute
    public long getMinute() {
        return Math.floorDiv(time - (getHour() * 3600), 60);
    }
    // get the current second
    public long getSecond() {
        return time - (getHour() * 3600) - (getMinute() * 60);
    }
    // get the seconds
    public long getSeconds() {
        return time;
    }
    // return a string of the time
    @Override public String toString() {
        return getHour() + " hour " + getMinute() + " minutes " + getSecond() + " seconds";
    }
    // compareTo method to return the difference between this object's elapse seconds and another's
    @Override public int compareTo(Time t) {
        return (int)(time - t.getSeconds());
    }
    // create a clone
    @Override public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
