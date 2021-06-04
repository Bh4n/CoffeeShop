package CoffeeShop.abstracts;

import CoffeeShop.entities.Customer;

public interface CustomerCheckService {
	boolean validate(Customer customer);
}
