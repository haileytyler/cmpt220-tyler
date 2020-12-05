import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        // Find the directed area of a triangle using the complex class

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompts
        System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
        // save the input x and y into an array of complex numbers
        Complex [] c = new Complex [3];
        for (int i = 0; i < 3; i++){
            double a = input.nextDouble();
            double b = input.nextDouble();
            c[i] = new Complex(a, b);
        }
        
        // Display answer:
        if ((c[1].getImaginaryPart() - c[0].getImaginaryPart())/(c[1].getRealPart() - c[0].getRealPart()) 
            == (c[2].getImaginaryPart() - c[0].getImaginaryPart())/(c[2].getRealPart() - c[0].getRealPart())) {
            System.out.println("The three points are on the same line"); // if the points are colinear
        }
        else {
            // Calculate the area
            Complex coeff = new Complex(0 , 0.25); // i/4
            System.out.println("The area of a triangle is " + coeff.multiply((((((c[0].multiply(c[1].conjugate())).add((c[0].conjugate())
                .multiply(c[2]))).add(c[1].multiply(c[2].conjugate()))).subtract((c[1].conjugate()).multiply(c[2]))).subtract((c[0].conjugate())
                .multiply(c[1]))).subtract(c[0].multiply(c[2].conjugate()))).toString());
        }
    }
}
