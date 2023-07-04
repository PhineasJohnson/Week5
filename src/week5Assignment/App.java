package week5Assignment;

public class App {
	public static void main(String[] args) {
		
		Logger loggerA1 = new AsteriskLogger();
		loggerA1.Log("Hello!");
		
		Logger loggerE1 = new AsteriskLogger();
		loggerE1.Error("Hey!");
		
		Logger loggerA2 = new SpacedLogger();
		loggerA2.Log("Hey!");
		
		Logger loggerE2 = new SpacedLogger();
		loggerE2.Error("Hey!");
	}
}
