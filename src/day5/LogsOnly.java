package day5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogsOnly {
	
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(LogsOnly.class.getName());
		
		int a = 30;
		int b = 40;
		
		if(a<b) {
			logger.log(Level.INFO,"a is smaller than b");
		}
		
	}

}
