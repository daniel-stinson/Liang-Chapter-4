/*
 * Area of a regular polygon
 */
package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter the number of sides
		System.out.println("Enter number of sides: ");
		double n = input.nextDouble();
		
		// Enter the side length
		System.out.println("Enter a side length: ");
		double s = input.nextDouble();
		
		// Compute
		double area = ((n * Math.pow(s, 2)) / (4 * Math.tan((Math.PI / n))));
		
		// Display
		System.out.printf("The area is %.2f ", area);

	}

}
