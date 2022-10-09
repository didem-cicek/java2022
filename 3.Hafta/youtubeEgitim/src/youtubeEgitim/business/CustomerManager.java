package youtubeEgitim.business;

import youtubeEgitim.entities.Customer;

public class CustomerManager {
	private ICreditManager _creditManager;
	private Customer _customer;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
		
	}
	public void GiveCredit() {
		_creditManager.Calcute();
		System.out.println("Kredi verildi.");
		_creditManager.Save();
	}
}
