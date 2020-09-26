import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Program to find the line equation given two points

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for the user for the two points
        System.out.println("Enter the coordinates for two points: ");
        double x_1 = input.nextDouble();
        double y_1 = input.nextDouble();
        double x_2 = input.nextDouble();
        double y_2 = input.nextDouble();

        // Find m and b
        double m = (y_2 - y_1) / (x_2 - x_1);
        double b = y_1 - m * x_1;

        // Testing :
        if (m == 1 && b != 0) { // m = 1
            System.out.println("The line equation for the two points (" + x_1 + ", " + y_1 + ") and (" 
            + x_2 + ", " + y_2 + ") is y = x " + " + " + String.format("%.5f",b));
        }
        if (m != 1 && b == 0) { // b = 0
            System.out.println("The line equation for the two points (" + x_1 + ", " + y_1 + ") and (" 
            + x_2 + ", " + y_2 + ") is y = " + String.format("%.5f", m) + "x");
        }
        if (m != 1 && b != 0) { // regular line equation
            System.out.println("The line equation for the two points (" + x_1 + ", " + y_1 + ") and (" 
            + x_2 + ", " + y_2 + ") is y = " + String.format("%.5f", m) + "x" + " + " + String.format("%.5f",b));
        }
        if (m == 1 && b == 0) { // b = 0, m = 1
            System.out.println("The line equation for the two points (" + x_1 + ", " + y_1 + ") and (" 
            + x_2 + ", " + y_2 + ") is y = x" );
        }
    }
}
