package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}

	public void Add() {
		System.out.println("Müþteri eklendi");
		logger.Log("Log mesajý");
	}
}