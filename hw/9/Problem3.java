import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Program that coverts a binary string into a decimal number

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter a binary string: ");
        String binaryString = input.next();

        // Answer
        try {
        System.out.println("Decimal Equivalent: " + bin2Dec(binaryString)); // will execute if no exception
        }
        catch (BinaryFormatException e) {
            System.out.println(e.getMessage()); // prints exception answer
        }
    }
    public static Long bin2Dec(String binaryString) throws BinaryFormatException {
        Long binaryDecimal = 0L; // initialize the binary decimal
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                binaryDecimal += (long)(Math.pow(2, binaryString.length() - 1 - i)); // raise 2 to length - 1 decreasing by 1
            }
            else if (binaryString.charAt(i) != '0') {
                throw new BinaryFormatException(binaryString); // throws a custom exception
            }
        }
        return binaryDecimal;
    }  
}
class BinaryFormatException extends Exception {
    // constructing the exception
    BinaryFormatException(String binaryString) {
        super(binaryString + ": Not a binary number");
    }
}