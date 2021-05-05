package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entity.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService iCustomerCheckService;
	
	public NeroCustomerManager(ICustomerCheckService iCustomerCheckService) {
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
