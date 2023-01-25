/*
 * Student major and class year
 */

package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter two characters to display major and year
		System.out.println("Enter two characters for major and year (e.g. M1 for Math and Freshman):");
		String studentInfo = input.nextLine();
		
		// Parse info
		char major = studentInfo.charAt(0);
		char year = studentInfo.charAt(1);

		// Display major
		
		if (major == 'b' || major == 'B') {
			System.out.print("Business ");
		} else if (major == 'c' || major == 'C') {
			System.out.print("Computer Science ");
		} else if (major == 'm' || major == 'M'){
			System.out.print("Mathematics ");
		} else if (major == 's' || major == 'S'){
			System.out.print("Science ");
		} else {
			System.out.println("Invalid major");
		}
		
		// Display year
		if (year == '1') {
			System.out.print("Freshman");
		} else if (year == '2') {
			System.out.print("Sophomore");
		} else if (year == '3') {
			System.out.print("Junior");
		} else if (year == '4') {
			System.out.print("Senior");
		} else {
			System.out.println("Invalid year");
		}
		
		

	}

}
