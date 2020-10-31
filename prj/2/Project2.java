import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        /** program that prompts the user to enter the investment amount (e.g., 1000) and the interest
        rate (e.g., 9%) and prints a table that displays future value for the years from 1 to 30, */

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("The amount invested: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        String annualInterestRate = input.next();

        // Finding the answer:
        int years = 30; // the specified number of years to display in the table
        double monthlyInterestRate = getmonthlyInterestRate(annualInterestRate); // save the monthly interest rate
        double[] yearsFutureValue = new double[years];
        for (int i = 0; i < years; i++) {
            yearsFutureValue[i] = futureInvestmentValue(investmentAmount, monthlyInterestRate, i + 1); // Fill in array with answer 
        }
        // Print results:
        printYearsFutureValue(yearsFutureValue, years);
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        // compute future investment value at a given interest rate for a specified number of years
        return Math.round((investmentAmount * Math.pow(1 + monthlyInterestRate, (years * 12)) * 100.00)) / 100.0 ; // Round to cents place
    }
    public static double getmonthlyInterestRate(String annualInterestRate) {
        // find monthly interest rate given yearly interest rate  
        return ((Double.parseDouble(annualInterestRate.replace("%", ""))) / 100) / 12;
    }
    public static void printYearsFutureValue(double[] yearsFutureValue, int years) {
        System.out.println("Years Future Value:");
        for (int i = 0; i < years; i++) {
            System.out.printf("%-4d%-4.2f", (i + 1), yearsFutureValue[i]); // prints the future investment for the specified number of years (left justified)
            System.out.println();
        }
    }
}
