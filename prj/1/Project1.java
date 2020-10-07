import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        /* Program that creates a histogram from a sequence of numbers.  The x-axis represents the
        values that we want to display the frequency for. The y-axis represents the number count 
        of occurrences in the data for each column and can be used to visualize data distributions. */

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt:
        System.out.println("Input: ");
        String input_numbers = input.nextLine(); // Inputs the numbers as a string
        String [] numbers = input_numbers.split(" "); // Splits the string into an array of strings of the numbers
        
        // Print out histogram:
        System.out.println("Output: ");
        int highest = 0; // Initialize the highest number as 0
        for (int number = 0; number < numbers.length; number++){ // loop through the array to find the highest number
            if (Integer.parseInt(numbers[number]) > highest) { 
                highest = Integer.parseInt(numbers[number]);  
            }
        }
        for (int i = highest; i >= 0; i--){ // Reverse loop as histogram has to print top down (y)
            String line = String.format("%2d |", i); // Line format with y-axis labels
            for(int number = 0; number < numbers.length; number++) { // (x)
                if (Integer.parseInt(numbers[number]) >= i){ // Puts an x if the number equals i or is greater than i- creating the stack
                    line += "  x"; // += adds the x to the end of the string
                }
                else {
                    line += "   ";
                }
            }
            System.out.println(line);
        }
        String line = "-----";
        for (int number = 0; number < numbers.length; number++){ // Prints a line to match how long the input is
            line += "---";
        }
        line += "----";
        System.out.println(line);

        line = "     "; // blank part in begining to move numbers over
        for (int number = 0; number < numbers.length; number++) { // Prints out the x-axis labels
            line += String.format("%2d ", Integer.parseInt(numbers[number]));
        }
        
        System.out.println(line);  
    }
}
