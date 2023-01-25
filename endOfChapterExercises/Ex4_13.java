/*
 * Determine if input is vowel or consonant
 */

package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input string
		System.out.println("Enter a letter: ");
		String letter = input.next();
		char ch = letter.charAt(0);
		
		// Invalid input
		if (ch < 65 || ch > 122 ) {
			System.out.println("Invalid input.");
			System.exit(0);
		}
		
		// Determine if vowel
		if (ch == 'a' 
			|| ch == 'e'
			|| ch == 'i'
			|| ch == 'o'
			|| ch == 'u'
			|| ch == 'A'
			|| ch == 'E'
			|| ch == 'I'
			|| ch == 'O'
			|| ch == 'U') {
		System.out.println("\"" + letter + "\" is a vowel.");
		} else {
			System.out.println("\"" + letter + "\" is a consonant.");
		}

	}

}
