package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.companyPayer;
import Entities.individualPayer;
import Entities.payer;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<payer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers:");
		int payers = sc.nextInt();
		for (int i = 0; payers > i; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			
			while (type != 'i' && type != 'c') {
				System.out.println("Type not found! Try Again!");
				System.out.print("Individual or company (i/c)?");
				type = sc.next().charAt(0);
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual Income: ");
			double annualIncome = sc.nextDouble(); 
			
				
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new individualPayer(name, annualIncome, healthExpenditures));
			}
			else if (type == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				
				list.add(new companyPayer(name, annualIncome, employees));
			}
		}

		double soma = 0;
		
		System.out.println();
		System.out.println("TAXES PAID");
		
		for (payer prp : list ) {
		
			System.out.println(prp.labels());
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES:");
		
		
		
		
		for (payer prp: list) {
			
			double tax = prp.taxes();
			 soma += tax;
		}
		
		System.out.printf("$ %.2f", soma);
		
		sc.close();
	}

}
