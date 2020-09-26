public class Problem3 {
    public static void main(String[] args) {
        /*Program that generate a random point in a circle with its center at the origin and radius of 5. 
        Finds the distance of that point to the center */
        
        // Genreate random rumbers:
        int min = -5;
        int max = 5;
        double random_x = Math.random() * (max-min+1) + min;
        double random_y = Math.random() * (max-min+1) + min;

         // Check to see if the point is in the circle and generate a new one if it is not:
         while (Math.pow(random_x,2) + Math.pow(random_y,2) >= 25){
            random_x = Math.random() * (max-min+1) + min;
            random_y = Math.random() * (max-min+1) + min;
         }
         // Calculate the distance
        double distance = Math.sqrt(Math.pow(random_x, 2) + Math.pow(random_y, 2));

        // Display results:
         System.out.println("The point is (" + random_x + ", " + random_y + ") and its distance to the center is " 
         + distance);
    }
}
