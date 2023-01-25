/*
 * Find a character in ASCII 
 */

package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter integer
		System.out.println("Enter an ASCII code: ");
		
		// Parse
		int ascii = input.nextInt();
		
		if (ascii < 0 || ascii > 127) {
			System.out.println("Invalid input.");
			System.exit(0);
		}
		
		// Display
		System.out.println("The character for the ASCII code is: " + (char)ascii);
	}

}
