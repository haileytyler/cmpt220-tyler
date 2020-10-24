import java.util.Scanner;
import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        // 

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter the first String: ");
        String s1 = input.next();
        System.out.println("Enter the second String: ");
        String s2 = input.next();

        // Display answer
        System.out.println(s1 + " and " + s2 + " are " + (isAnagram(s1,s2)? "" : "not ") + "anagrams.");
    }
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char [] s1_array = s1.toCharArray();
        char [] s2_array = s2.toCharArray();

        java.util.Arrays.sort(s1_array);
        java.util.Arrays.sort(s2_array);

        for(int i = 0; i < s1_array.length; i++) {
            if(s1_array[i] != s2_array[i]) return false;
        }
        return true;

    }
}
