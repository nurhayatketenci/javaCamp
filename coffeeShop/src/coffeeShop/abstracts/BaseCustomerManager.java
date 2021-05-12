package coffeeShop.abstracts;

import coffeeShop.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	  public abstract void Save(Customer customer) ;

}
