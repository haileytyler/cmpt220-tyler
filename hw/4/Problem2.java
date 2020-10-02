import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        /* Program to program that prompts the user to enter the number of the sides of a 
        polygon with n sides centered at (0,0), the radius of the bounding circle of the polygon, 
        and displays the coordinates of the corner points on the polygon. */

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display Prompt:
        System.out.println("Enter the number of sides: ");
        int num_sides = input.nextInt();
        System.out.println("Enter the radius of the bounding circle: ");
        int radius = input.nextInt();
        
        // Find the coordinates
        System.out.println("The coordinates of the points on the polygon are");
        for (int i = 0; i < num_sides; i++) {
            double x = radius * Math.cos(2.0 * Math.PI / num_sides * i);
            double y = radius * Math.sin(2.0 * Math.PI / num_sides * i);
            
            System.out.println("(" + String.format("%.4f", x) + ", " + String.format("%.4f", y) + ")");
        }
    }    
}
