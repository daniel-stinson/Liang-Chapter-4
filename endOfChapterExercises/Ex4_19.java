/*
 * Revise Ex 3.9 using strings
 */

package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter the first 9 digits
		
				System.out.print("Enter the first 9 digits of the ISBN-Number: ");
				String firstNine = input.nextLine();
				
				int d1 = Integer.parseInt(firstNine.substring(0, 1));
				int d2 = Integer.parseInt(firstNine.substring(1, 2));
				int d3 = Integer.parseInt(firstNine.substring(2, 3));
				int d4 = Integer.parseInt(firstNine.substring(3, 4));
				int d5 = Integer.parseInt(firstNine.substring(4, 5));
				int d6 = Integer.parseInt(firstNine.substring(5, 6));
				int d7 = Integer.parseInt(firstNine.substring(6, 7));
				int d8 = Integer.parseInt(firstNine.substring(7, 8));
				int d9 = Integer.parseInt(firstNine.substring(8));
				
				// Calculate the total using the formula
				// (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
				
				int checkSum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
				
				// Display using if statement
				if(checkSum == 10) {
					System.out.println("The ISBN-10 number is: ");
					System.out.print(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + "X");
				} else {
					System.out.println("The ISBN-10 number is: ");
					System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + checkSum);
				}

	}

}
