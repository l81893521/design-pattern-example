package chain.server;

/**
 * 销售经理，可以批准30%以内的折扣
 * @author zhangjiawei
 *
 */
public class Manager extends PriceHandler{

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.3) {
			System.out.format("%s批准了折扣:%.2f%n", this.getClass().getName(),discount);
		}else{
			//交给下一级处理
			successor.processDiscount(discount);
		}
		
	}

}
