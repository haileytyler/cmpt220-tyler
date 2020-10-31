import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Program to find the intersecting point between two lines

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        Point [] p = new Point [4];
        for (int i = 0; i < 4; i++){
            double x = input.nextDouble();
            double y = input.nextDouble();
            p[i] = new Point(x,y);
        }
        Point intersectingPoint = new Point();
        if (getIntersectingPoint(p[0], p[1], p[2], p[3]) == null) {
            System.out.println("The two lines are parallel");
        }
        else{
            intersectingPoint = getIntersectingPoint(p[0], p[1], p[2], p[3]);
            System.out.println("The intersecting point is at (" + String.format("%.5f",intersectingPoint.get_x()) + ", " + String.format("%.4f",intersectingPoint.get_y()) + ")");

        }
    }
    public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4) {
        double a = p1.get_y() - p2.get_y();
        double b = p1.get_x() - p2.get_x();
        double c = p3.get_y() - p4.get_y();
        double d = p3.get_x() - p4.get_x();

        if (a * d - b * c == 0) {
            return null;
        }

        double e = (a * p1.get_x()) - (b * p1.get_y());
        double f = (c * p3.get_x()) - (d * p3.get_y());

        return new Point(((e * d) - (b * f))/((a * d) - (b * c)), ((a * f) - (e * c))/((a * d) - (b * c))); // 
    }
}
class Point {
    private double x;
    private double y;

    Point() {
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
