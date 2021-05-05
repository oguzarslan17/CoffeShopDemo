package Abstract;

import Entity.Customer;

public interface ICustomerCheckService {

	Boolean CheckIfRealPerson(Customer customer);
}
