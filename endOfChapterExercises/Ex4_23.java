/*
 * Prints a payroll statement
 */
package endOfChapterExercises;

import java.util.Scanner;

public class Ex4_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter name, pay rate, hours worked, federal tax withholding, state tax withholding
		System.out.println("Enter employee's name: ");
		String employeeName = input.nextLine();
		
		System.out.println("Enter hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter hours worked: ");
		double hoursWorked = input.nextDouble();
		
		System.out.println("Enter federal withholding rate: ");
		double fedRate = input.nextDouble();
		
		System.out.println("Enter state withholding rate: ");
		double stateRate = input.nextDouble();
		
		// Calculate
		double grossPay = hourlyRate * hoursWorked;
		double fedDeduct = (grossPay * (fedRate * .01));
		double fedWithhold = grossPay - fedDeduct;
		double stateDeduct = (grossPay * (stateRate * .01));
		double stateWithhold = grossPay - stateDeduct;
		double totalDeductions = fedDeduct + stateDeduct;
		double netPay = grossPay - totalDeductions;
		
		// Display
		System.out.println("Employee Name: " + employeeName);
		System.out.printf("Pay Rate: $%.2f", hourlyRate);
		System.out.println();
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.printf("Gross Pay: $%.2f", hourlyRate * hoursWorked);
		System.out.println("\nDeductions: ");
		System.out.printf("\t Federal Withholding: $%.2f", fedDeduct);
		System.out.println();
		System.out.printf("\t State Withholding: $%.2f", stateDeduct);
		System.out.println();
		System.out.printf("\t Total Deductions: $%.2f", totalDeductions);
		System.out.printf("\nNet Pay: $%.2f", netPay);
	}

}
