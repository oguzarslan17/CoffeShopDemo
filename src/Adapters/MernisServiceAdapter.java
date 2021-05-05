package Adapters;

import Abstract.ICustomerCheckService;
import Entity.Customer;

public class MernisServiceAdapter implements ICustomerCheckService{
	
	@Override
	public Boolean CheckIfRealPerson(Customer customer) {
		
		//servisi burada kullanýp istek atýp dönen yanýtý alacaðýz.
		return false;
	}
}
