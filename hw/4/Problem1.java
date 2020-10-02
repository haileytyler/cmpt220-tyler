import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        /* This program generates  generates two
        random single-digit numbers to form a question for addition, 
        subtraction, multiplication, or division */

        // Create a scanner object
        Scanner input = new Scanner(System.in);
        
        int selection = 0;
        while (selection != 5){
            // Display Prompt:
            System.out.print("Main Menu\n1: Addition\n2: Subtraction\n3: Multiplication\n4: Division\n5:"  
            +" Exit\nEnter a choice: ");

            selection = input.nextInt();

            int number1 = NumberGen();
            int number2 = NumberGen();

            int answer = 0;
            if (selection == 1) { // Addtion test
    
                // Add the numbers
                answer = number1 + number2;
            }
            if (selection == 2) { // Subtraction test
                
                // Make sure that number2 >= number 1
                while (number1 < number2) {
                    number1 = NumberGen();
                    number2 = NumberGen();
                }

                // Subtract the numbers:
                answer = number1 - number2;
            }
            if (selection == 3){ // Multiplication Test
               
                // Multiply the numbers:
                answer = number1 * number2;
            }
            if (selection == 4){
                
                // Make sure that number2 != 0
                while (number2 == 0){
                    number2 = NumberGen();
                }

                // Divide the numbers:
                answer = number1 / number2;
            }
            if (selection == 5){
                break;
            }

            String [] list =  {" + ", " - ", " * ", " / "};
            System.out.println("What is " + number1 + list[selection - 1] + number2 + "?");
            int guess = input.nextInt();
            if (guess == answer){
                System.out.println("Correct");
            } else {
                System.out.println("Your answer is wrong. The correct answer is: " + answer);
            }
        
        }
    }    
    public static int NumberGen() {
        return (int)(Math.random() * 10);
    }
}
