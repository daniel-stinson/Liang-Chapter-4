/*
 * Order 3 cities
 */

package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user to enter three cities
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		
	// City 1,2,3
		if (city1.compareTo(city2) < 0 && city2.compareTo(city3) < 0) {
		System.out.println("The cities in alphabetical order are " +
		city1 + " " + city2 + " " + city3);
	// City 1,3,2
		} else if (city1.compareTo(city3) < 0 && city3.compareTo(city2) < 0) {
		System.out.println("The cities in alphabetical order are " +
		city1 + " " + city3 + " " + city2);
	// City 2,1,3
		} else if (city2.compareTo(city1) < 0 && city1.compareTo(city3) < 0) {
		System.out.println("The cities in alphabetical order are " +
		city2 + " " + city1 + " " + city3);
	// City 2,3,1
		} else if (city2.compareTo(city1) < 0 && city3.compareTo(city1) < 0) {
		System.out.println("The cities in alphabetical order are " +
		city2 + " " + city3 + " " + city1);
	// City 3,1,2
		} else if (city3.compareTo(city1) < 0 && city1.compareTo(city2) < 0) {
		System.out.println("The cities in alphabetical order are " +
		city3 + " " + city1 + " " + city2);
	// City 3,2,1
		} else if (city3.compareTo(city2) < 0 && city2.compareTo(city1) < 0) {
		System.out.println("The cities in alphabetical order are " +
		city3 + " " + city2 + " " + city1);
		} 

	}

}
