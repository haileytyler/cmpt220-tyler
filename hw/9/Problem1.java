import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Program that generates an array of 100 random integers and displays the given index

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter the index of the array: ");
        int index = input.nextInt();
        
        try {
            System.out.println("The integer is: " + indexOfArray(index)); // will execute if no exception
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds"); // print an error message when an exception is thrown
        }
    }
    public static int indexOfArray(int index) throws ArrayIndexOutOfBoundsException {
        int[] array = new int[100]; // initialize an array
        int min = 1;
        int max = 999;
        for (int i = 0; i < 100; i++) {
            array[i] = (int)(Math.random() * (max - min + 1) + min); // fill array with random numbers from 1-999
        }
        return array[index]; // throws an exception when out the index is out of bounds
    }
}
