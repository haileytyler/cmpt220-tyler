import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        /** Program to test complex class */

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompts
        System.out.println("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();

        // Display answer:
        Complex complexNum1 = new Complex(a, b); // create a new complex number
        Complex complexNum2 = new Complex(c, d); // create a new complex number
        
        System.out.println("(" + complexNum1.toString() + ") + (" + complexNum2.toString() + ") = " + complexNum1.add(complexNum2).toString());
        System.out.println("(" + complexNum1.toString() + ") - (" + complexNum2.toString() + ") = " + complexNum1.subtract(complexNum2).toString());
        System.out.println("(" + complexNum1.toString() + ") * (" + complexNum2.toString() + ") = " + complexNum1.multiply(complexNum2).toString());
        System.out.println("(" + complexNum1.toString() + ") / (" + complexNum2.toString() + ") = " + complexNum1.divide(complexNum2).toString());
        System.out.println("|" + complexNum1.toString() + "| = " + Complex.abs(complexNum1));
    }
}

