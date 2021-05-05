package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entity.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private ICustomerCheckService iCustomerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
		this.iCustomerCheckService = iCustomerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if(iCustomerCheckService.CheckIfRealPerson(customer))
			super.save(customer);
		else
			System.out.println("not a valid person");
	}

}
