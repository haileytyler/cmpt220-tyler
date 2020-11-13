import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Project3 {
    public static void main(String[] args) {

        // Create a scanner object
        Scanner userInput = new Scanner(System.in);

        // Get input from the user
        System.out.println("Enter the year: ");
        int year = userInput.nextInt();
        System.out.println("Enter the gender: ");
        String gender_string = userInput.next();
        char gender = Character.toUpperCase(gender_string.charAt(0)); // make gender string to uppercase gender char
        System.out.println("Enter the name: ");
        String name = userInput.next();
        userInput.close();

        String filename = "prj/3/babynameranking" + year + ".txt"; // create a filename pointing to the right directory
        ArrayList<BabyName> names = loadNames(filename); // load the names in the file

        try {
            BabyName babyname = findName(name, year, gender, names); // find the BabyName rank for the input
            System.out.println(babyname.getName() + "(" + babyname.getGender() + ") is ranked #" + babyname.getRank() + " in year " + year);
        }
        catch (Exception e) {
            System.out.println(e.getMessage()); // prints the exception error for a name that is not ranked
        } 
    }
    private static ArrayList<BabyName> loadNames(String filename) {
        File file = new File(filename); // create a File
        ArrayList<BabyName> names = new ArrayList<>(); // initialize an array list of BabyNames
        Scanner read = null; // initialize the scanner
        try {
            read = new Scanner(file); // scan through the file
            while (read.hasNext()) { // while the file still has more lines
                String s = read.nextLine(); // save the next line as a string
                String[] temp = s.split("\t"); // split the string into an array
                names.add(new BabyName(Integer.parseInt(temp[0]), temp[1], 'M')); // add the male rank to the arraylist
                names.add(new BabyName(Integer.parseInt(temp[0]), temp[2], 'F')); // add the female rank to the arraylist
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage()); // print file not found exception
            System.exit(1); // exit the program
        }
        finally {
            if (read != null) read.close(); // close the scanner
        }
        return names;
    }
    private static BabyName findName(String name, int year, char gender, ArrayList<BabyName> names) throws Exception {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).getName().equalsIgnoreCase(name) && names.get(i).getGender() == gender) { // check gender (because some names are gender neutral)
                return names.get(i); // return matched BabyName
            }
        }
        throw new Exception("The name " + name + " is not ranked in year " + year); // throw exception for a name that is not ranked in the given year
    }
}
class BabyName {
    // data fields
    int rank;
    String name;
    char gender;
    // BabyName constructor
    BabyName(int newRank, String newName, char newGender) {
        rank = newRank;
        name = newName;
        gender = newGender;
    }
    // get rank
    int getRank () {
        return rank;
    }
    // get name
    String getName () {
        return name;
    }
    // get gender
    char getGender () {
        return gender;
    }
}