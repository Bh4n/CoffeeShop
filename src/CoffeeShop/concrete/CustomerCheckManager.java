package CoffeeShop.concrete;

import CoffeeShop.abstracts.CustomerCheckService;
import CoffeeShop.entities.Customer;

public class CustomerCheckManager  implements CustomerCheckService {

	@Override
	public boolean validate(Customer customer) {
	
		System.out.println("Kullanici dogrulandi");
		return true;
	}

}
