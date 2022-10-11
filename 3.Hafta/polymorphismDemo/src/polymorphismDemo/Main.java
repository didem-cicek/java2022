package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger();
		logger.log("Log mesajı");
		
		BaseLogger [] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};

		for (BaseLogger forLogger:loggers) {
			forLogger.log("Log mesajı");
		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
		
	}

}
