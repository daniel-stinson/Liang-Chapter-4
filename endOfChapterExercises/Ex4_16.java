/*
 * Randomly generates a number, which correlates to a letter
 */

package endOfChapterExercises;

public class Ex4_16 {

	public static void main(String[] args) {
		String letterString;
		
		// Randomly generate a number
		for (int i = 1; i < 26; i++) {
		int letter = ((int)(Math.random() * 26 + 1));
		// Convert it to a letter
		switch (letter) {
		case 1: letterString = "a"; break;
		case 2: letterString = "b"; break;
		case 3: letterString = "c"; break;
		case 4: letterString = "d"; break;
		case 5: letterString = "e"; break;
		case 6: letterString = "f"; break;
		case 7: letterString = "g"; break;
		case 8: letterString = "h"; break;
		case 9: letterString = "i"; break;
		case 10: letterString = "j"; break;
		case 11: letterString = "k"; break;
		case 12: letterString = "l"; break;
		case 13: letterString = "m"; break;
		case 14: letterString = "n"; break;
		case 15: letterString = "o"; break;
		case 16: letterString = "p"; break;
		case 17: letterString = "q"; break;
		case 18: letterString = "r"; break;
		case 19: letterString = "s"; break;
		case 20: letterString = "t"; break;
		case 21: letterString = "u"; break;
		case 22: letterString = "v"; break;
		case 23: letterString = "w"; break;
		case 24: letterString = "x"; break;
		case 25: letterString = "y"; break;
		case 26: letterString = "z"; break;
		default: letterString = "Invalid"; break;
		}
		System.out.print(letterString.toUpperCase());
		}
	}

}
