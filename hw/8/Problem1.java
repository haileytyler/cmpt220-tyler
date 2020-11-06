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
        list = split(input_string, input_delimiters);
        
        System.out.println("There are " + list.size() + " pieces: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static ArrayList<String> split(String s, String delimiters) {
        String cur_piece = "";
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            if(delimiters.indexOf(s.charAt(i)) >= 0) {
                list.add(cur_piece);
                cur_piece = "";
            }
            else cur_piece += s.charAt(i);
        }
        if (cur_piece.length() > 0) list.add(cur_piece);
        return list;
    }
}

