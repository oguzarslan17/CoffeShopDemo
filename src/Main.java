import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setFirstName("Kaya");;
		
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(customer);
		
		BaseCustomerManager baseCustomerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager baseCustomerManager2 = new StarbucksCustomerManager(new CustomerCheckManager());
		
		baseCustomerManager1.save(customer);
		baseCustomerManager2.save(customer);
	}

}
