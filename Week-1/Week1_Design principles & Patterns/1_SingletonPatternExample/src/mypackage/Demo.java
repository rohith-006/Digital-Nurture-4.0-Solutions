package mypackage;

public class Demo {

	public static void main(String[] args) {
		Logger logger=Logger.getinstance();
		Logger logger2=Logger.getinstance();
		
		
		logger.log("My first log");
		logger2.log("My second log");
	System.out.println(logger==logger2?true:false);
	}

}
