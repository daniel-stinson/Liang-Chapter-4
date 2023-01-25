/*
 * Enter 2 strings, and check to see if the second contains a substring of the first
 */
package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter the 2 strings
		System.out.println("Enter String 1:");
		String s1 = input.nextLine();
		
		System.out.println("Enter String 2:");
		String s2 = input.nextLine();
		
		// Check if it contains substring
		if (s1.contains(s2)) {
			System.out.println(s2 +" is a substring of " + s1);
		} else {
			System.out.println(s2 +" is not a substring of " + s1);
		}

	}

}
