import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Program to solve the 0/1 Knapsack Probem

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();
        System.out.println("Enter the weights for each item: ");
        double [] w = new double[n];
        for (int i = 0; i < n; i++) {
           w[i] = input.nextDouble();
        }
        System.out.println("Enter the weight limit for the items placed in the bag: ");
        double weightLimit = input.nextInt();

        // Answer
        System.out.println("The maximum weight of the items placed in the bag is " + m(n, weightLimit, w));
    }
    public static double m(int i, double weightLimit, double[] w) {
        if (i == 0 || weightLimit == 0) {
            return 0;
        }
        else if (w[i - 1] > weightLimit) {
            return m(i - 1, weightLimit, w);
        }
        else {
            return Math.max(m(i - 1, weightLimit, w), w[i - 1] + m(i - 1, weightLimit - w[i - 1], w));
        }
    }
}
