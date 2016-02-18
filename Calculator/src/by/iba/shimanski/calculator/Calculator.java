package by.iba.shimanski.calculator;

public class Calculator {
			
	public static double calculate(double operand1, double operand2, Operation operation) {
		switch(operation) {
			case ADDITION:
				return operand1 + operand2;
			case SUBTRACTION:
				return operand1 - operand2;
			case MULTIPLICATION: 
				return operand1 * operand2;
			case DIVISION:
				return operand1 / operand2; 
			case POW:
				return Math.pow(operand1, operand2);
			case REMAINDER:
				return operand1 % operand2;
			case MAX:
				return Math.max(operand1, operand2);
			case MIN:
				return Math.min(operand1, operand2);
			case HYPOT:
				return Math.hypot(operand1, operand2);
			case IEEEREMAINDER:
				return Math.IEEEremainder(operand1, operand2);
		}		
		return 0;
	}
	
}
