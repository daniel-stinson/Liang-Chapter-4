/*
 * Phone keyboard
 */

package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_15 {

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
			|| ch == 'b'
			|| ch == 'c'
			|| ch == 'A'
			|| ch == 'B'
			|| ch == 'C') {
		System.out.println("\"" + letter + "\" is a 2.");
		} else if (ch == 'd' 
				|| ch == 'e'
				|| ch == 'f'
				|| ch == 'D'
				|| ch == 'E'
				|| ch == 'F') {
		System.out.println("\"" + letter + "\" is a 3.");
		} else if (ch == 'g' 
				|| ch == 'h'
				|| ch == 'i'
				|| ch == 'G'
				|| ch == 'H'
				|| ch == 'I') {
		System.out.println("\"" + letter + "\" is a 4.");
		} else if (ch == 'j' 
				|| ch == 'k'
				|| ch == 'l'
				|| ch == 'J'
				|| ch == 'K'
				|| ch == 'L') {
		System.out.println("\"" + letter + "\" is a 5.");
		} else if (ch == 'm' 
				|| ch == 'n'
				|| ch == 'o'
				|| ch == 'M'
				|| ch == 'N'
				|| ch == 'O') {
		System.out.println("\"" + letter + "\" is a 6.");
		} else if (ch == 'p' 
				|| ch == 'q'
				|| ch == 'r'
				|| ch == 's'
				|| ch == 'P'
				|| ch == 'Q'
				|| ch == 'R'
				|| ch == 'S') {
		System.out.println("\"" + letter + "\" is a 7.");
		} else if (ch == 't' 
				|| ch == 'u'
				|| ch == 'v'
				|| ch == 'T'
				|| ch == 'U'
				|| ch == 'V') {
		System.out.println("\"" + letter + "\" is a 8.");
		} else if (ch == 'w' 
				|| ch == 'x'
				|| ch == 'y'
				|| ch == 'z'
				|| ch == 'W'
				|| ch == 'X'
				|| ch == 'Y'
				|| ch == 'Z') {
		System.out.println("\"" + letter + "\" is a 9.");
		} else {
		System.out.println("Invalid input.");
		}

	}

}
