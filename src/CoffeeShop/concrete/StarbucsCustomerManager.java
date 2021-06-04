package CoffeeShop.concrete;

import CoffeeShop.abstracts.BaseCustomerManager;
import CoffeeShop.abstracts.CustomerCheckService;
import CoffeeShop.entities.Customer;

public class StarbucsCustomerManager extends BaseCustomerManager {

	private CustomerCheckService checkservice;

	public StarbucsCustomerManager(CustomerCheckService checkservice) {
		super();
		this.checkservice = checkservice;
	}

	@Override
	public void save(Customer customer) {

		if (checkservice.validate(customer)) {
			System.out.println("Mernis sistemi ile giri� ba�ar�l�.");
			super.save(customer);
			
		}else {
			
			System.out.println("Ki�i do�rulanamad�.");
		}
		
	}
}
