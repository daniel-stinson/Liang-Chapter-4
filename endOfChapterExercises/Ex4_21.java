/*
 * Checks if an entered SSN is valid
 */
package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter the SSN
		System.out.println("Enter a Social Security number like XXX-XX-XXXX: ");
		String ssn = input.nextLine();
		
		// Check length
		if (ssn.length() != 9) {
		System.out.println(ssn + " is not a valid SSN.");
		}
		
		// Display
		char d1 = ssn.charAt(0);
		char d2 = ssn.charAt(1);
		char d3 = ssn.charAt(2);
		char d4 = ssn.charAt(3);
		char d5 = ssn.charAt(4);
		char d6 = ssn.charAt(5);
		char d7 = ssn.charAt(6);
		char d8 = ssn.charAt(7);
		char d9 = ssn.charAt(8);
		System.out.println("The SSN of " + d1 + d2 + d3 + "-" + d4 + d5 + "-" + d6 + d7 + d8 + d9 + " is a valid SSN.");

	}

}
