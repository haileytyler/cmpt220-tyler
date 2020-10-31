import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Program to find the center of a triangle

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
        Point [] p = new Point [3];
        for (int i = 0; i < 3; i++){
            double x = input.nextDouble();
            double y = input.nextDouble();
            p[i] = new Point(x,y);
        }
        Point centerPoint = getCenterPoint(p[0], p[1], p[2]);
        System.out.println("The center point is at (" + centerPoint.get_x() + ", " + centerPoint.get_y() + ")");
    }
    public static Point getCenterPoint(Point p1, Point p2, Point p3) {
        return new Point((p1.get_x() + p2.get_x() + p3.get_x())/3, (p1.get_y() + p2.get_y() + p3.get_y())/3);
    }
}
class Point {
    private double x;
    private double y;

    Point () {
    }

    Point (double new_x, double new_y) {
        x = new_x;
        y = new_y;
    }

    double get_x () {
        return x;
    }

    double get_y () {
        return y;
    }
}