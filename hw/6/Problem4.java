import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        // 

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter a, b, c, d: ");
        double [][] A = new double [2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = input.nextDouble();
            }
        }
        
        // Display answer:
        try {
            double [][] I = inverse(A);
            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 2; column++) {
                    System.out.print(I[row][column] + " ");
                }
            System.out.println();
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static double[] [] inverse(double [][] A) throws Exception {
        double determinant = (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
        if (determinant == 0) {
            throw new Exception("No Inverse Matrix");
        }
        double [][] I = {{(1/determinant * A[1][1]), (1/determinant * -A[0][1])}, {(1/determinant * -A[1][0]), (1/determinant * A[0][0])}};
        return I;
        
         
    }
}
