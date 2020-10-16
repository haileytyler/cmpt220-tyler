import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Program that returns a string in the form of hour:minute:second for a given total seconds using the following header

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt:
        System.out.println("Enter total seconds: ");
        long total_seconds = input.nextLong();

        
        // Display Results:
        System.out.println("The hours, minutes, and seconds for total seconds " + total_seconds + " is " + format(total_seconds));

    }
    public static String format(long total_seconds) {
        // Take the floor of the total seconds divided by 3600 (as there are 3600 seconds in an hour)
        long hours = Math.floorDiv(total_seconds, 3600);
        // Take the floor of the seconds left after taking out the hours divided by 60
        long minutes = Math.floorDiv(total_seconds - (hours * 3600), 60);
        // The remaining seconds
        long seconds = total_seconds - (hours * 3600) - (minutes * 60);

        return String.format("%02d:%02d:%02d", hours, minutes, seconds); // Format so there is a preceding 0 if needed
    }
}
