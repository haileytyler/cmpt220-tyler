import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Program to prompt the user to enter a decimal integer value and displays the corresponding binary value 

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt:
        System.out.println("Enter an integer: ");
        int value = input.nextInt();

        // Print the answer:
        System.out.println("The binary value is: " + decimalToBinary(value));
    }
    public static String decimalToBinary(int value) {
        String binary = "";
        while (value > 0) { // Moves right to left one digit at a time converting each
            binary =  ( (value % 2 ) == 0 ? "0" : "1") + binary; // Binary is a base 2 number
            value = value / 2; // Divide number by two each iteration
        }
        return binary;
    }
}
