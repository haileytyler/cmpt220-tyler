import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Program to count the occurances of each digit in a string

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter a String: ");
        String s = input.next();

        // Display Answer
        int [] occurances = count(s);

        for (int i = 0; i < 10; i++){
            if(occurances[i] != 0){
                System.out.println("Digit " + i + " occurs " + occurances[i] + " times.");
            }
        }

    }
    public static int[] count(String s) {
        int [] occurances = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // Initialize occurances
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0'; // assigning the digit value
            if (digit >= 0 && digit <= 9) { // valid digit
                occurances[digit] += 1; // adding to the occurances
            }
        }
        return occurances;    
    }
}
