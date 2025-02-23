package revel1;
import java.util.Scanner;

public class MovieDriver {
	public static class MovieApp {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String userResponse;

	        // Loop 
	        do {
	            // new movie 
	            Movie movie = new Movie();

	            //Ask the user for the input
	            System.out.print("Enter the movie title: ");
	            String title = scanner.nextLine();
	            movie.setTitle(title); 

	            
	            System.out.print("Enter the movie rating: ");
	            String rating = scanner.nextLine();
	            movie.setRating(rating); 

	
	            System.out.print("Enter the number of tickets sold: ");
	            int soldTickets = scanner.nextInt();
	            movie.setSoldTickets(soldTickets); 

	            
	            scanner.nextLine(); 
	            
	            // Print the output
	            System.out.println("\nMovie Information:");
	            System.out.println(movie.toString());

	            // Ask the user if they want to continue
	            System.out.print("\nDo you want to enter another movie? (yes/no): ");
	            userResponse = scanner.nextLine();

	        } while (userResponse.equalsIgnoreCase("yes")); // Continue loop if the user types "yes"

	        
	        scanner.close();
	    }
	}
}
