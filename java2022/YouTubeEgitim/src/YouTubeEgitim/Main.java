package YouTubeEgitim;

public class Main {

	public static void main(String[] args) {
		/*
		 * CreditManager creditManager = new CreditManager(); creditManager.Calculate();
		 * creditManager.Save();
		 * 
		 * Customer customer = new Customer(); customer.setId(1);
		 * customer.setCity("Ankara");
		 * 
		 * CustomerManager customerManeger = new CustomerManager(customer);
		 * customerManeger.Save(); customerManeger.Delete();
		 * 
		 * Company company = new Company(); company.setCompanyName("Ar�elik");
		 * company.setTaxNumber("222222"); company.setId(100);
		 * 
		 * CustomerManager customerManager2 = new CustomerManager(new Person());
		 * 
		 * Person person = new Person(); person.setNationalIdentity("333333");
		 * 
		 * Customer c1 = new Customer(); Customer c2 = new Person(); Customer c3 = new
		 * Company();
		 */
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
		
	}

}
