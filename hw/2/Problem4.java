import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        // Program to find the slope of a line:

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for two points:
        System.out.println("Enter the coordinates for two points: ");
        double x_1 = input.nextDouble();
        double y_1 = input.nextDouble();
        double x_2 = input.nextDouble();
        double y_2 = input.nextDouble();

        // Calculate the slope:
        double slope = (y_2 - y_1) / (x_2 - x_1);
        
        // Display the results:
        System.out.println("The slope for the line that connects the two points (" 
        + x_1 + ", " + y_1 + ") and (" + x_2 + ", " + y_2  + ") is " + String.format("%.5f",slope));


    }
}
