/*
 * Area of hexagon
 */

package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter the side
		System.out.println("Enter a side length: ");
		double s = input.nextDouble();
		
		// Compute
		double area = ((6 * Math.pow(s, 2)) / (4 * Math.tan((Math.PI / 6))));
		
		// Display
		System.out.printf("The area of a hexagon with the side length of " + s + " is %.2f ", area);
		

	}

}
