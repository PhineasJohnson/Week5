package week5Assignment;

public class SpacedLogger implements Logger{
// Creates the output for the Spaced Logger's log.
	@Override
	public void Log(String logInput) {
		String trueLog = "";
		
		for (int i = 0; i < logInput.length(); i++) {
			if (i < logInput.length() - 1) {
				trueLog += logInput.charAt(i) + " ";
			} else {
				trueLog += logInput.charAt(i);
			}
		}
		System.out.println(trueLog);
		
	}
// Creates the output for the Spaced Logger's error.
	@Override
	public void Error(String errorInput) {
		String trueErr = "";
		
		for (int i = 0; i < errorInput.length(); i++) {
			if (i < errorInput.length() - 1) {
				trueErr += errorInput.charAt(i) + " ";
			} else {
				trueErr += errorInput.charAt(i);
			}
		}
		System.out.println("ERROR: " + trueErr);
		
	}

}
