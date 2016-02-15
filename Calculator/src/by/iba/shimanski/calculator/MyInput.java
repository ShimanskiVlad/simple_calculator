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
	
	public static Operation inputOperation() {
		Operation operation = null;
		String temp = null;
		temp = sc.nextLine();
		do {
			System.out.println("Input operation(+, -, *, /):");
			temp = sc.nextLine();
			operation = getOperation(temp);
		}
		while (checkOperation(temp) == false);
		return operation;
	}
	
	private static Operation getOperation(String s) {
		Operation operation = null;
		switch(s) {
			case "+":
				operation = Operation.ADDITION;
				break;
			case "-":
				operation = Operation.SUBTRACTION;
				break;
			case "*":
				operation = Operation.MULTIPLICATION;
				break;
			case "/":
				operation = Operation.DIVISION;
				break;
		}
		return operation;
	}
	
	private static boolean checkOperation(String s) {
		if ("+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s)) {
			return true;
		}
		return false;
	}

}
