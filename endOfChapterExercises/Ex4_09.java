/*
 * Find a character in Unicode
 */
package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter char
		System.out.println("Enter character: ");
		
		String userChar = input.nextLine();
		if (userChar.length() != 1) {
			System.out.println("You must enter exactly one character");
			System.exit(1);
		}
		// Get the char from the string
		char uni = userChar.charAt(0);
		
		// Display
		System.out.print("The Unicode for the character \"" + uni + "\" is: " );
		System.out.print((int)uni);
	}

}
