/*
 * Modifies EX3_11 to take string input
 */

package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_17 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		// User input for month and year
		
		System.out.println("Enter a month: ");
		String month = input.nextLine();

		System.out.println("Enter a year: ");
		int userYear = input.nextInt();
		
		// Determine if it's a leap year
		
		boolean isLeapYear = (userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0);
		
		// Display result
		
		// Determine month from input
		
		if ( month.equals("January") || month.equals("March") || 
				  month.equals("May") || month.equals("July") ||
				  month.equals("August") || month.equals("October") ||
				  month.equals("December"))
				System.out.println(month + " " + userYear + " has 31 days");
		
		// Determine 30 or 31 days
		else if (month.equals("April") || month.equals("June") || 
				month.equals("September") || month.equals("November"))
				System.out.println(month + " " + userYear + " has 30 days");
		else if (month.equals("February"))
			System.out.println(month + " " + userYear +  " has " +((isLeapYear) ? 29 : 28) + " days");
		else 
			System.out.println("Invalid");
		
	}

}
