import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        // Program that displays a Pascal triangle

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt:
        System.out.println("Enter the number of rows: ");
        int rows = input.nextInt();

        // Display Triangle
        PascalTriangle(rows);
    }
    public static void PascalTriangle(int rows) {
        for (int i = 0; i <= rows; i++) { // The rows for the triangle (#rows + 1)
            for (int space = 0; space < rows - i; space++) { // Align the terms in the triangle correctly
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) { // The terms of the traingle
                System.out.print(String.format("%4d", PascalTerm(i, j))); // Correctly format the terms (%4d must be double the spaces added)
            }
            System.out.println();
        } 
    }
    public static int PascalTerm(int m, int n){
        int term = 1; 
        if (n > m - n) {
            n = m - n; // If this is negative then the term would be 1 (anything choose 0 is 1)
        }
        for (int l = 0; l < n; ++l) { // loop for the factorial and calculates the term
            term *= (m - l); 
            term /= (l + 1); 
        } 
        return term; 
    }
}
