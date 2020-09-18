import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Program to find the height of a building using physics

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for the ball travel time
        System.out.println("Enter the ball travel time in seconds: ");
        double travel_time = input.nextDouble();

        //Calculate the height:
        double v_0 = 0;
        double a = 9.8;
        double height = v_0 * travel_time + a * Math.pow(travel_time, 2)/2;

        // Print the results:
        System.out.println("The height of the building is " + String.format("%.3f",height) + " meters.");

    }
}

