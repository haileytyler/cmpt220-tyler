import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        /* Program to determine whether the inputted number is a proper fraction or an improper fraction.
        If it is a proper fraction, the number is displayed. If not, it is reduced to a mixed 
        fraction or to an integer. */

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for the numerator and denominator
        System.out.println("Enter a numerator: ");
        int numerator = input.nextInt();
        System.out.println("Enter a denominator: ");
        int denominator = input.nextInt();

        // Testing and Results:
        if (numerator % denominator == 0){ // Improper with reduction
            System.out.println(numerator + " / " + denominator + " is an improper fraction and it can be reduced to " +
            (numerator/denominator));
        }
        if (numerator % denominator == numerator) { // Proper
            System.out.println(numerator + " / " + denominator + " is a proper fraction");
        } 
        if (numerator % denominator != 0 && numerator % denominator != numerator) { // Improper to mixed number
            System.out.println(numerator + " / " + denominator + " is an improper fraction and its mixed number is " 
            + (numerator / denominator) + " + " + (numerator % denominator) + " / " + denominator);
        }
    }
}