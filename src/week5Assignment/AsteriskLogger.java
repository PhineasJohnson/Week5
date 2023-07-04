package week5Assignment;

public class AsteriskLogger implements Logger {

	@Override
	// Will print the string put into it with three asterisks on either side.
	public void Log(String logInput) {
		System.out.println("***" + logInput + "***");
	}

	@Override
	// Will print the error string with a box of asterisks on all sides.
	public void Error(String errorInput) {
		String inputAsterisks = "";
		for (int i = 0; i < errorInput.length(); i++) {
			inputAsterisks = inputAsterisks + "*";
		}
		System.out.println("**********" + inputAsterisks + "***");
		System.out.println("***ERROR: " + errorInput + "***");
		System.out.println("**********" + inputAsterisks + "***");
	}
	
}
