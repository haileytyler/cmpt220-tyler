import java.util.Scanner;
import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {
        // Program to solve the 0/1 Knapsack Probem and display the items

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
        ArrayList<Integer> weights = m(n, weightLimit, w); // call the recursive function
        ArrayList<Double> result = new ArrayList<>(); 
        for (Integer i: weights) { 
            result.add(w[weights.get(i)]); // get the weights that are from the function
        }
        double total = 0;
        for (int i = 0; i < result.size(); i++) {
            total += result.get(i); // find the max weight of items in the bag
        }
        // Print answer
        System.out.println("The maximum weight of the items placed in the bag is " + total);
        System.out.print("The items in the bag are");
        for (Integer i: weights) {
            System.out.print(" #" + (weights.get(i) + 1));
        }
        System.out.println();
        System.out.print("The weights of the items in the bag are");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(" " + result.get(i));
        }
        System.out.println();
    }
    public static ArrayList<Integer> m(int i, double weightLimit, double[] w) {
        // recursive helper method
        ArrayList<Integer> weights = new ArrayList<>();
        m(i, weightLimit, w, weights);
        return weights;
    }
    public static double m(int i, double weightLimit, double[] w, ArrayList<Integer> indexes) {
        if (i == 0 || weightLimit == 0) {
            return 0;
        }
        else if (w[i - 1] > weightLimit) {
            return m(i - 1, weightLimit, w, indexes);
        }
        else {
            double maximum = Math.max(m(i - 1, weightLimit, w, indexes), w[i - 1] + m(i - 1, weightLimit - w[i - 1], w, indexes));
            if (maximum <= weightLimit && !indexes.contains(i - 1)) { // maximum less than or equal to the weight limit and not already put
                indexes.add(i - 1);
            }
            return maximum;
        }
    }
}

