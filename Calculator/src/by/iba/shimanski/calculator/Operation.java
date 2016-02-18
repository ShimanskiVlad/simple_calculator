package by.iba.shimanski.calculator;

public enum Operation {
	ADDITION("+"),
	SUBTRACTION("-"),
	MULTIPLICATION("*"),
	DIVISION("/"),
	POW("^"),
	REMAINDER("%"),
	MAX("max"),
	MIN("min"),
	HYPOT("hypot"),
	IEEEREMAINDER("IEEEremainder");
	
	private String value;
	
	private Operation(String type) {
		value = type;
	}
	
	public String getValue() {
		return value;
	}

	public static boolean hasOperation(String s) {
		for (Operation oper: Operation.values()) {
			if (oper.getValue().equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public static Operation getOperation(String s) {
		for (Operation oper: Operation.values()) {
			if (oper.getValue().equals(s)) {
				return oper;
			}
		}
		return null;
	}
}
