// P3 Assignment
// Author: Tori Mitchell
// Date: Jun 23, 2015
// Class:  CS160
// Email: tmitch56@rams.colostate.edu  

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		
		System.out.print("Gross Salary: ");
			float grossSal = console.nextFloat();
		
		System.out.print("Number of Exemptions: ");
			int numOfExemptions = console.nextInt();
		
		System.out.print("Interest Income: ");
			double intIncome = console.nextDouble();
		
		System.out.print("Capital Gains: ");
			double capGains = console.nextDouble();
		
		double fedTotIncome = grossSal + intIncome + capGains;
		double adjIncome = fedTotIncome - (numOfExemptions * 1500.00);
		
		System.out.printf("Total Income: $%,.2f%n", fedTotIncome);
		System.out.printf("Adjusted Income: $%,.2f%n", adjIncome);
		
		double fedTotTax = 0;
		if ((0 < adjIncome) && (adjIncome < 10000))
			fedTotTax = adjIncome * 0;
		else if ((10000 < adjIncome) && (adjIncome < 28000))
			fedTotTax = (adjIncome - 10000) * 0.15;
		else if ((28000 < adjIncome) && (adjIncome < 54000))
			fedTotTax = ((adjIncome - 28000) * 0.25) + ((28000 - 10000) * 0.15); 
		else if (54000 < adjIncome)
			fedTotTax = ((adjIncome - 54000) * 0.28) + ((54000 - 28000) * 0.25) + ((28000 - 10000) * 0.15);
		else
			fedTotTax = 0;
		
		System.out.printf("Total Tax: $%,.2f%n", fedTotTax);
		
		double stateTax = adjIncome * 0.05;
		System.out.printf("State Tax: $%,.2f%n", stateTax);
		
		
		
	}

}
