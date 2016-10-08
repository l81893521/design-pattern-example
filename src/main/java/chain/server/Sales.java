package chain.server;

/**
 * 普通销售人员，他可以批准5%以内的折扣
 * @author zhangjiawei
 *
 */
public class Sales extends PriceHandler{

	@Override
	public void processDiscount(float discount) {
		if(discount < 0.05){
			System.out.format("%s批准了折扣:%.2f%n", this.getClass().getName(),discount);
		}else {
			//交给下一级处理
			successor.processDiscount(discount);
		}
	}
}
