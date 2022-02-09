package Detyra;
import java.util.Scanner;
public class Investment {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			int choice;
			int years = 5;
			double interestRate = 3.9;
			int[] investments = new int[6];
			
		
			System.out.println("Welcome to the Investment program!");
			
			do {
			System.out.println("Available options:");
			System.out.println("1.Enter the initial amount of money for 6 investments and store them inside an array");
			System.out.println("2.Calculate and print the total amounts for each investments of the array.");
			System.out.println("Enter 1 or 2 or anything else to exit!");
			choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1:
				fillArrayInvestments(investments);
				break;
				
			case 2:
				calculateAndPrintInvestments(investments,years,interestRate);
				break;
				
			}
			}
			while(choice == 1 || choice ==2); 
			System.out.println("The program is over");
			
	    }
		
		public static double invest(int money, int years, double interestRate) {
			double ROI = money * (1 + (years * (interestRate/100)));
			return ROI;
		}
		
		public static int[] fillArrayInvestments(int[] InvestmentsArray) {
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("Enter 6 amounts of money for investment");
			
			for (int i = 0; i < InvestmentsArray.length; i++) {
				InvestmentsArray[i] = scanner.nextInt();
			}
			
			return InvestmentsArray;
		}
		
		public static void calculateAndPrintInvestments(int[] InvestmentArray, int years, double interestRate) {
			
			for(int i=0; i<6; i++) {
				double investment = invest(InvestmentArray[i], years, interestRate);
				System.out.println("The ROI for investment " +" is " + investment);
			}
		}
		
		
	}
