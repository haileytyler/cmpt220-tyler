import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Program to find all genes in an entered genome

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Display Prompt:
        System.out.println("Enter a geonome string: ");
        String genome = input.next().toUpperCase();
        
        // Find the genes:
        String gene_start = "ATG";
        String [] gene_ends = {"TAG", "TAA", "TGA"};

        int start_pos = genome.indexOf(gene_start);
        boolean found = false;
        while(start_pos != -1) {
            genome = genome.substring(start_pos + 3);
            for (int i = 0; i < gene_ends.length; i++) {
                int end_pos = genome.indexOf(gene_ends[i]);
                if(end_pos != -1 && end_pos % 3 == 0) {
                    found = true;
                    System.out.println(genome.substring(0, end_pos));
                }
            }
            start_pos = genome.indexOf(gene_start); 
        }
        if (!found) {
            System.out.println("no gene is found");
        }  
    }
}
