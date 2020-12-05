public class Complex extends Number implements Cloneable, Comparable<Complex>{
    // serialization
    private static final long serialVersionUID = 1L;
    // data fields
    private double real = 0;
    private double imaginary = 0;
    // constructors
    Complex (double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    Complex (double real) {
        this.real = real;
    }
    Complex () {
        // no arg constructor
    }
    // get real part
    double getRealPart () {
        return real;
    }
    // get imaginary part
    double getImaginaryPart () {
        return imaginary;
    }
    // override toString
    @Override
    public String toString() {
        if (imaginary == 0) 
            return real + "";
        else
            return real + " + " + imaginary + "i";
    }
    // add a complex number to this complex number
    public Complex add(Complex secondComplex) {
        double a = real + secondComplex.getRealPart();
        double b = imaginary + secondComplex.getImaginaryPart();
        return new Complex(a, b);
    }
    // subtract a complex number from this complex number
    public Complex subtract(Complex secondComplex) {
        double a = real - secondComplex.getRealPart();
        double b = imaginary - secondComplex.getImaginaryPart();
        return new Complex(a, b);
    }
    // multiply a complex number by this complex number
    public Complex multiply(Complex secondComplex) {
        double a = (real * secondComplex.getRealPart()) - (imaginary * secondComplex.getImaginaryPart());
        double b = (imaginary * secondComplex.getRealPart()) + (real * secondComplex.getImaginaryPart());
        return new Complex(a, b);
    }
    // divide a complex number by this complex number
    public Complex divide(Complex secondComplex) {
        double a = ((real * secondComplex.getRealPart()) + (imaginary * secondComplex.getImaginaryPart())) 
            / (Math.pow(secondComplex.getRealPart(), 2) + Math.pow(secondComplex.getImaginaryPart(), 2));
        double b = ((imaginary * secondComplex.getRealPart()) - (real * secondComplex.getImaginaryPart())) 
            / (Math.pow(secondComplex.getRealPart(), 2) + Math.pow(secondComplex.getImaginaryPart(), 2));
        return new Complex(a, b);
    }
    // absolute value of a complex number
    public static double abs(Complex complex) {
        return Math.sqrt(Math.pow(complex.getRealPart(), 2) + Math.pow(complex.getImaginaryPart(), 2));
    }
    // conjugate of a complex number (for extra credit)
    public Complex conjugate() {
        return new Complex(real, -imaginary);
    }
    @Override // Implement the abstract intValue method in Number 
    public int intValue() {
        return Integer.parseInt(Double.toString(this.getRealPart()));
    }
    
    @Override // Implement the abstract floatValue method in Number 
    public float floatValue() {
        return Float.parseFloat(Double.toString(this.getRealPart()));
    }
    
    @Override // Implement the doubleValue method in Number 
    public double doubleValue() {
        return Double.valueOf(this.getRealPart()); 
    }
    
    @Override // Implement the abstract longValue method in Number 
    public long longValue() {
        return Long.parseLong(Double.toString(this.getRealPart()));
    }

    @Override // Implement the compareTo method in Comparable 
    public int compareTo(Complex o) {
        if (abs(this) - abs(o) > 0) 
            return 1;
        else if (abs(this) - abs(o) < 0) 
            return -1;
        else
            return 0;
    }

    @Override 
    public Object clone() { // clone the object
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
