package by.iba.shimanski.calculator;

public class Calculator {
			
	public static double calculate(double operand1, double operand2, Operation operation) {
		double result = 0;
		if (Operation.ADDITION == operation) {
			return operand1 + operand2;
		}
		else if (Operation.SUBTRACTION == operation) {
			return operand1 - operand2;
		}
		return result;
	}
	
}
