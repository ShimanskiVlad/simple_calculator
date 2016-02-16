package by.iba.shimanski.calculator;

import java.util.Scanner;

public class MyInput {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static double inputDouble() {
		double d = 0;
		System.out.println("Input number:");
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
	
	public static String inputOperation() {
		String operation = sc.nextLine();
		do {
			System.out.println("Input operation("
					+ Operation.ADDITION + ", " +
					Operation.DIVISION + ", " +
					Operation.MULTIPLICATION + ", " +
					Operation.POW + ", " + 
					Operation.REMAINDER + ", " +
					Operation.SUBTRACTION + ", " +
					Operation.MAX + ", " +
					Operation.MIN + ", " +
					Operation.HYPOT + ", " +
					Operation.IEEEREMAINDER + "):");
			operation = sc.nextLine();
		}
		while (checkOperation(operation) == false);
		return operation;
	}
	
	private static boolean checkOperation(String s) {
		if (Operation.ADDITION.equals(s) || 
				Operation.SUBTRACTION.equals(s) ||
				Operation.MULTIPLICATION.equals(s) || 
				Operation.DIVISION.equals(s) || 
				Operation.POW.equals(s) ||
				Operation.REMAINDER.equals(s) ||
				Operation.MAX.equals(s) ||
				Operation.MIN.equals(s) ||
				Operation.HYPOT.equals(s) ||
				Operation.IEEEREMAINDER.equals(s)) {
			return true;
		}
		return false;
	}

}
