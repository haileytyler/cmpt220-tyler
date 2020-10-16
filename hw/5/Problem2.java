import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Program that prompts the user to enter a string and invokes this method, and displays the return value from this method.

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt:
        System.out.println("Enter a String: ");
        String s = input.nextLine();

        // Print the answer:
        title(s);
    }
    public static void title(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) { 
            // Capitilize the first letter and all letters after a space
            str += (i == 0 || s.charAt(i - 1) == ' ')? Character.toUpperCase(s.charAt(i)) : s.charAt(i);
        }
        System.out.println("The new string is: " + str);
    }
}
