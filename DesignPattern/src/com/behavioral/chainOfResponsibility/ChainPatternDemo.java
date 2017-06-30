/**
 * 
 */
package com.behavioral.chainOfResponsibility;

/**
 * @author aprasa03
 *
 */
public class ChainPatternDemo {
	
	
	private static AbstractLogger  getAbstractLogger()
	{
		AbstractLogger errorLogger=new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger=new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger=new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractLogger nextLogger= getAbstractLogger();
		
		nextLogger.logMessage(AbstractLogger.INFO, "This is Information");
		nextLogger.logMessage(AbstractLogger.DEBUG, "This is Debug");
		nextLogger.logMessage(AbstractLogger.ERROR, "This is Error");

	}

}
