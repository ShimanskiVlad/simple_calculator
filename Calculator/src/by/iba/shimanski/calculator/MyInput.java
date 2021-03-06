package by.iba.shimanski.calculator;

import java.util.Scanner;

public class MyInput {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static double inputDouble(String s) {
		double d = 0;
		System.out.println("Input " + s + " number:");
		while (true) {
			try{
				d = Double.parseDouble(sc.next());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Input number:");
			}
		}
		return d;
	}
	
	public static Operation inputOperation() {
		String operation = sc.nextLine();
		Operation result;
		do {
			System.out.println("Input operation from the the list:");
			Operation[] operations = Operation.values();
			for (Operation oper : operations) {
				System.out.print(oper.getValue() + " ");
			}
			System.out.println();
			operation = sc.nextLine();
			result = Operation.getOperation(operation);
		}
		while (Operation.hasOperation(operation) == false);
		return result;
	}
	
}
