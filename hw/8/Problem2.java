import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Method that splits a string into substrings using delimiter characters

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display prompt
        System.out.println("Enter the number of objects: ");
        int num_objects = input.nextInt();
        System.out.println("Enter the weights of the objects: ");
        int [] weights = new int[num_objects];
        for (int i = 0; i < num_objects; i++) {
           weights[i] = input.nextInt();
        }

        int container = 1; // first container
        while (max_index(weights, 10) >= 0) { // anything left?
            System.out.print("Container " + container + " contains objects with weight ");
            int capacity = 10; // container capacity starts at 10 (can hold 10 pounds max)
            while (capacity > 0 && max_index(weights, capacity) >= 0) { // container has space?  can anything else fit?
                int indx = max_index(weights, capacity); // get index of biggest fitting object
                System.out.print(weights[indx] + " "); 
                capacity -= weights[indx]; // decrease the container capacity by object
                weights[indx] = 0; // take object out of list
            }
            container++; // start a new container
            System.out.println();
        }
    }
    public static int max_index(int [] weights, int max_val) {
        int indx = -1; // if no values up to max_val exist or everything is 0
        int max = 0; // 0 means object is already in a container
        for (int i = 0; i < weights.length; i++) { // loop through find biggest one 
            if (weights[i] > max && weights[i] <= max_val) { // this one will fit
                max = weights[i];
                indx = i;
            }
        }
        return indx;
    }         
}

