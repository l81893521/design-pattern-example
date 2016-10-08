package chain.client;

import chain.server.PriceHandler;

/**
 * 客户，请求折扣
 * @author zhangjiawei
 *
 */
public class Customer {
	
	//价格处理接口，无需关注实际处理人
	private PriceHandler priceHandler;
	
	/**
	 * 请求折扣
	 * @param discount 客户请求的折扣
	 */
	public void requestDiscount(float discount){
		priceHandler.processDiscount(discount);
	}

	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}
	
}
