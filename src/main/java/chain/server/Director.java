package chain.server;

/**
 * 销售总监，可以处理40%以内的折扣
 * @author zhangjiawei
 *
 */
public class Director extends PriceHandler{

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.4) {
			System.out.format("%s批准了折扣%.2f%n", this.getClass().getName(),discount);
		}else{
			//交给下一级处理
			successor.processDiscount(discount);
		}
	}

}
