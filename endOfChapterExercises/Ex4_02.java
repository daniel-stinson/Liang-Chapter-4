/*
 * Great circle distance using formula 
 * 
 * d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 */

package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get input
		System.out.println("Enter point 1 (latitude and longitude) in degrees:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter point 2 (latitude and longitude) in degrees:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Compute
		double r = 6371.01;
		// d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		// Calculate its great circle distance
		double d = 
			r * Math.acos(Math.sin(x1) * Math.sin(x2) + 
			Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		// Display
		System.out.println("The distance between the two points is " + d);

	}

}
