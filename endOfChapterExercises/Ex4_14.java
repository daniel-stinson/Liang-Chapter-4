/*
 * Convert letter grade to number
 */
package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input a letter grade
		System.out.println("Enter a letter grade: ");
		String grade = input.next();
		char ch = grade.charAt(0);
		
		// Convert to a number
		System.out.println("The numeric value of the grade \"" + grade.toUpperCase() + "\" is ");
		if (ch == 'a' || ch == 'A') {
			System.out.print("1");
		} else if (ch == 'b' || ch == 'B') {
			System.out.print("2");
		} else if (ch == 'c' || ch == 'C') {
			System.out.print("3");
		} else if (ch == 'd' || ch == 'D') {
			System.out.print("4");
		} else if (ch == 'f' || ch == 'F') {
			System.out.print("5");
		} else {
			System.out.print("Invalid input");
		}

	}

}
