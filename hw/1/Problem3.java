public class Problem3 {
    public static void main(String[] args) {
        // Displaying the Answer:
        
        int line = 1; // Declaring and assigning 1 to line for the first line of output
        while (line <= 5) {  // Loop to print 5 lines of code
                if (line == 1 || line == 5) { // if statement since the first and last are different
                    System.out.println("* ***** *****");
                }
                else{
                    System.out.println("* *   * *   *");
                } 
            line++; } // Adding to line after each iteration
    }
}
