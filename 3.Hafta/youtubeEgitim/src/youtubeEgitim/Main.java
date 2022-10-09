package youtubeEgitim;

import youtubeEgitim.business.CustomerManager;
import youtubeEgitim.business.MilitaryCreditManager;
import youtubeEgitim.business.TeacherCreditManager;
import youtubeEgitim.entities.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.GiveCredit();
	}

}
