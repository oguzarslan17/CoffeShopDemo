package Concrete;

import Abstract.ICustomerCheckService;
import Entity.Customer;

public class CustomerCheckManager implements ICustomerCheckService{
	
	@Override
	public Boolean CheckIfRealPerson(Customer Customer) {
		
		//do�rulanm�� varsayd�k. Bu bizim kendi servisimiz.
		return true;
	}
}
