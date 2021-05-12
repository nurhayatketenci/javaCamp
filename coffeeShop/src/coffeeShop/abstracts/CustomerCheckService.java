package coffeeShop.abstracts;

import coffeeShop.entities.Customer;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(Customer customer);

}
