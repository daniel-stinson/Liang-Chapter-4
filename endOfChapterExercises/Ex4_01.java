/*
 * Format area of pentagon
 */
package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get input
		System.out.println("Enter the length from center to a vertex: ");
		
		double r = input.nextDouble();
		
		// Compute
		double s = (2 * r) * (Math.sin((Math.PI / 5)));
		
		double area = ((5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5))));
		
		// Display
		System.out.printf("The area of a pentagon with the r of " + r + " is %.2f ", area);

	}

}
