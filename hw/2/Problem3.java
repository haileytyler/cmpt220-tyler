import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Program to find the coeffiecient of friction

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for the force applied, object mass, and object acceration
        System.out.println("Enter the friction force in Newtons: ");
        double F = input.nextDouble();

        // Prompt the user for the object mass
        System.out.println("Enter the object's mass in kg: ");
        double m = input.nextDouble();

        // Prompt the user for the object acceleration
        System.out.println("Enter the object's acceleration in m/s^2: ");
        double a = input.nextDouble();

        // Calculate the coefficient of friction
        double g = 9.8;
        double u = (F - m * a) / (m * g);

        // Display results
        System.out.println("The coefficient of friction is " + String.format("%.6f",u));
    }    
}
