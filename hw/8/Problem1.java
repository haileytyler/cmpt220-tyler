import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // Method that splits a string into substrings using delimiter characters

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter a string: ");
        String input_string = input.nextLine();
        System.out.println("Enter delimiters: ");
        String input_delimiters = input.nextLine();

        // Answer:
        ArrayList<String> list = new ArrayList<String>();
        list = split(input_string, input_delimiters); // save answer into an array list
        
        System.out.println("There are " + list.size() + " pieces: "); // print out the array list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static ArrayList<String> split(String s, String delimiters) {
        String cur_piece = ""; // current piece
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) { // iterate through the string
            if(delimiters.indexOf(s.charAt(i)) >= 0) { // find a delimeter in the string
                list.add(cur_piece); // add the current piece to list
                cur_piece = ""; // reset the piece
            }
            else cur_piece += s.charAt(i); // if no delimeter is found it returns -1 and then adds the character to the current piece
        }
        if (cur_piece.length() > 0) list.add(cur_piece); // adds the last piece to the list
        return list;
    }
}

