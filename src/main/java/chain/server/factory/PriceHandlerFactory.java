package chain.server.factory;

import chain.server.CEO;
import chain.server.Director;
import chain.server.Lead;
import chain.server.Manager;
import chain.server.PriceHandler;
import chain.server.Sales;
import chain.server.VicePresident;

public class PriceHandlerFactory {

	/**
	 * 构造PriceHandler工厂
	 * @return
	 */
	public static PriceHandler createPriceHandler(){
		PriceHandler sales = new Sales();
		PriceHandler lead = new Lead();
		PriceHandler manager = new Manager();
		PriceHandler director = new Director();
		PriceHandler vp = new VicePresident();
		PriceHandler ceo = new CEO();
		//指定直接后继
		sales.setSuccessor(lead);
		lead.setSuccessor(manager);
		manager.setSuccessor(director);
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		//返回sales,最低级
		return sales;
	}

}
