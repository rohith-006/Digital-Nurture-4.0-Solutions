package mypackage;

public class Logger {
	private static Logger logger1 = new Logger();
	private Logger() {
	   System.out.println("Log is created");
	}
	
	public static Logger getinstance() {
		return logger1;
	}
	public  void log(String message) {
		System.out.println("LOG: "+message);
	}
}
