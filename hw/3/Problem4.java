import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        // Modify this subtraction quiz to display incorrect and correct messages
        
        // 1. Generate two random single-digit integers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 3. Prompt the student to answer "what is number1 – number2?"
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        
        // 4. Grade the answer and display the result
        if (number1 - number2 == answer){
            // Add in the random correct message:
            String [] correct_messages = {"excellent", "way to go", "correct"};
            String correct_message = correct_messages[(int) (Math.random() * correct_messages.length)];

            System.out.println(correct_message);
        }
        else {
            // Add in the random incorrect message:
            String [] incorrect_messages = {"wrong", "not right", "incorrect"};
            String incorrect_message = incorrect_messages[(int) (Math.random() * incorrect_messages.length)];

            System.out.println(incorrect_message);

            System.out.println(number1 + " - " + number2 + 
                " should be " + (number1 - number2)); 
        }
    }    
}
