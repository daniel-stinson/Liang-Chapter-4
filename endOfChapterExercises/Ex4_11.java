/*
 * Decimal to Hex conversion
 */
package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter decimal between 1 & 15
		System.out.print("Enter a decimal value (0 to 15): ");
		int userDecimal = input.nextInt();
		
		// Invalid input
		if (userDecimal < 0 || userDecimal > 15) {
			System.out.println("Invalid input.");
			System.exit(0);
		}
		
		// Convert and display
		if (userDecimal >= 0 && userDecimal <= 9)
			System.out.println("The hex value is " + userDecimal);
		else if (userDecimal >= 10 && userDecimal <= 15)
			System.out.println("The hex value is " + (char)(userDecimal + 'A' - 10));
	}

}
