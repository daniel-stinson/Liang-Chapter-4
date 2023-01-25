/*
 * 
 * Enter a string and display length and its first character
 */

package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter the string
		System.out.println("Enter a string: ");
		String userLine = input.nextLine();
		
		// Display length
		System.out.println("The length of your string is " + userLine.length());
		
		// Display first character
		System.out.println("The first character in your string is " + userLine.charAt(0));

	}

}
