package Adapters;

import Abstract.ICustomerCheckService;
import Entity.Customer;

public class MernisServiceAdapter implements ICustomerCheckService{
	
	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		//servisi burada kullan�p istek at�p d�nen yan�t� alaca��z.
		return false;
	}
}
