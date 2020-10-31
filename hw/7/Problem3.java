import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Program to find the area of a triangle

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
        try {
            System.out.println("The area of a triangle is " + getTriangleArea(p[0], p[1], p[2]));
        }
        catch(Exception e) {
            System.out.println(e.getMessage()); // prints the exception message
        }
    }
    public static double getTriangleArea(Point p1, Point p2, Point p3) throws Exception {
        if ((p2.get_y() - p1.get_y())/(p2.get_x() - p1.get_x()) == (p3.get_y() - p1.get_y())/(p3.get_x() - p1.get_x())) {
            throw new Exception("The three points are on the same line");
        }
        return 0.5 * ((p1.get_x()*(p2.get_y() - p3.get_y())) +  (p2.get_x()*(p3.get_y() - p1.get_y())) 
        + (p3.get_x()*(p1.get_y() - p2.get_y())));
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