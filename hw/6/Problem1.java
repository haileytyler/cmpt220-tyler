import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // 

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt:
        System.out.println("Enter six end points of a convex polygon (x then y) in the clockwise direction: ");
        int [] x_points = new int[6];
        int [] y_points = new int[6];
        for (int i = 0; i < 6; i++) {
           x_points[i] = input.nextInt();
           y_points[i] = input.nextInt();
        }

        int area = 0; // Initializing the area
        int j = 5;
        for (int i = 0; i < 6; i++) {
            area += (x_points[j] + x_points[i]) * (y_points[j] - y_points[i]);
            j = i; // j is now the previous vertex to i
        }
        System.out.println("Area: " + area / 2);
    }
}
