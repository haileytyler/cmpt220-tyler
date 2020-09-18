import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Program to find the area, perimeter, and diagonal length

        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the width and height:
        System.out.println("Enter the width and height of a rectangle: ");
        double width = input.nextDouble();
        double height = input.nextDouble();

        // Compute the perimeter:
        double perimeter = (2 * width) + (2 * height);

        // Compute the area:
        double area = width * height;

        // Compute the diagonal length:
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        // Print the results:
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
        System.out.println("The length of the diagonal is " + diagonal);
        
    }    
}