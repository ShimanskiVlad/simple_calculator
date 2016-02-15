package by.iba.shimanski.calculator;

public class Calculator {
			
	public static double calculate(double operand1, double operand2, String operation) {
		double result = 0;
		if (Operation.ADDITION.equals(operation)) {
			return operand1 + operand2;
		}
		else if (Operation.SUBTRACTION.equals(operation)) {
			return operand1 - operand2;
		}
		else if (Operation.MULTIPLICATION.equals(operation)) {
			return operand1 * operand2;
		}
		else if (Operation.DIVISION.equals(operation)) {
			return operand1 / operand2;
		}
		else if (Operation.POW.equals(operation)) {
			return Math.pow(operand1, operand2);
		}
		else if (Operation.REMAINDER.equals(operation)) {
			return operand1 % operand2;
		}
		return result;
	}
	
}
