package coffeeShop.concrete;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db : "+customer.getFirstName()+" "+customer.getLastName());
		}
		else {
			System.out.println("Not a valid person.");
		}
		
	}

   
}
