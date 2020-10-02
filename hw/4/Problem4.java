import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        // Program to simplify a square root

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt:
        System.out.println("Enter a positive integer: ");
        int radicand = input.nextInt();
     
        int highest_factor = 1; 
        for (int i = radicand; i > 2; i--) {
            if(Math.sqrt(i) == (int)Math.sqrt(i) && radicand % i == 0){
                highest_factor = i;
                break;
            }
        }
        if (radicand == highest_factor) {
            System.out.println("sqrt(" + radicand + ") is " + (int)Math.sqrt(radicand));
        } 
        else if (highest_factor == 1) {
            System.out.println("sqrt(" + radicand + ") is " + "sqrt(" + radicand + ")");
        }
        else {
            System.out.println("sqrt(" + radicand + ") is " + (int)Math.sqrt((double)highest_factor) + "*sqrt(" 
            + radicand / highest_factor + ")");   
        }
    }
}
