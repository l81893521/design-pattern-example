package chain;

import chain.client.Customer;
import chain.server.factory.PriceHandlerFactory;

public class Test {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
		
		customer.requestDiscount(0.54f);
	}
	
}
