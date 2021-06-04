package CoffeeShop;

import CoffeeShop.abstracts.BaseCustomerManager;
import CoffeeShop.abstracts.CustomerService;
import CoffeeShop.adapters.MernisServiceAdapter;
import CoffeeShop.concrete.CustomerCheckManager;
import CoffeeShop.concrete.NeroCustomerManager;
import CoffeeShop.concrete.StarbucsCustomerManager;
import CoffeeShop.entities.Customer;

public class Main {
	public static void main(String[] args) {

		Customer customer = new Customer(1, "Enes Bahan", "Morova", 1999, "12312312312");
		BaseCustomerManager manager = new StarbucsCustomerManager(new MernisServiceAdapter());
		manager.save(customer);
		
	}
}
