package by.iba.shimanski.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {	
	
	public static void main(String[] args) {
		double d1 = MyInput.inputDouble();
		double d2 = MyInput.inputDouble();
		Operation operation = MyInput.inputOperation();
		System.out.println(d1 + " " + operation + " " + d2 + " = " + Calculator.calculate(d1, d2, operation));
	}

}
