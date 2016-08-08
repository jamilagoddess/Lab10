//TASK: List movies by category

//WHAT WILL THE APPLICATION DO?
//1. The application stores a list of 10 movies and displays them by category.
//2. The user can enter any of the following categories to display the films in
//the list that match the category: animated drama, horror, scifi
//3. After the list is displayed, the user is asked if he or she wants to continue.
//If not, the program ends.

//BUILD SPECIFICATIONS
//1. Each movie should be represented by an object of type Movie.  The Movie class
//must provide two private fields: title and category. Both of these fields should be
//Strings. The class should also provide a constructor that accepts a title and category
//as parameters and uses the values passed to it to initialize its fields.
//2. When the user enters a category, the program should read through all of the movies
//in the ArrayList and display a line for any movie whose category matches the category 
//entered by the user.
//3. Sufficient tests should be present

//EXTENDED EXERCISES
//1. Standardize the category codes by displaying a menu of categories and having the 
//user select the category by number rather than entering the name. 
//2. Display the movies for the selected category in alphabetical order.
//3. Get the class MoviesIO from the GC GitHub.  This class has a method named getMovie. 
//Use this method to fill the array list with 100 Movie objects.

package Lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		
		// Initialize and set variables
		String choice = "";
		String name = "";
		boolean run = true;

		// Initialize and set ArrayList
		ArrayList<Movies> list = new ArrayList<Movies>();

		//Assign variable and initial values to Movies list
		//Movies mov = new Movies(null, null);

		list.add(new Movies("Star Wars", "Science Fiction"));
		list.add(new Movies("Independence Day", "Science Fiction"));
		list.add(new Movies("Alien", "Science Fiction"));
		list.add(new Movies("Saw", "Horror"));
		list.add(new Movies("Bride of Chucky", "Horror"));
		list.add(new Movies("Cars", "Kids"));
		list.add(new Movies("Angry Birds", "Kids"));
		list.add(new Movies("Ice Age", "Kids"));
		list.add(new Movies("You've Got Mail", "Romantic Comedy"));
		list.add(new Movies("When Harry Met Sally", "Romantic Comedy"));
		list.add(new Movies("How To Lose a Guy In Seven Days", "Romantic Comedy"));

		// greet user
		System.out.println("Welcome to the Movie List Application! \n\nThere are 10 movies in this list.");
		
		// boolean run set to true to set up the condition for the while loop
		while (run) {
			// invite user to enter a category
			System.out.println("What category are you interested in? "
					+ "(select \"Science Fiction\", \"Horror\", \"Kids\" or \"Romantic Comedy\")");
			name = scan1.nextLine();
			
			// create for loop to get items from list that correspond to the category that the user entered
			// print titles only
			for (int i = 0; i < list.size(); i++) {
				if ((list.get(i).getCategory().equalsIgnoreCase(name))) {
					System.out.println(list.get(i).getTitle());
				}
			}
			
			// create while loop to invite user to choose another category
			System.out.println("\nWould you like to choose another category? (yes or no)");
			choice = scan1.nextLine();
			
			// define options to continue or end program
			if (choice.equalsIgnoreCase("yes")) {
					run = true;
			} else if (choice.equalsIgnoreCase("no")) {
					System.out.println("Goodbye!");
					//break;
					run = false;
				}
			}		
		scan1.close();
		}
	}


