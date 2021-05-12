package coffeeShop.concrete;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to db : "+customer.getFirstName()+" "+customer.getLastName());
		
	}
 
}
