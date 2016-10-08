package chain.server;

/**
 * CEO可以批准55%以内的折扣
 * 同时他也是这个责任链的最后一个处理者
 * @author zhangjiawei
 *
 */
public class CEO extends PriceHandler{

	@Override
	public void processDiscount(float discount) {
		if (discount <= 0.55) {
			System.out.format("%s批准了折扣:%.2f%n",this.getClass().getName(),discount);
		}else{
			//不会再往下走
			System.out.format("%s拒绝了折扣:%.2f%n",this.getClass().getName(),discount);
		}
	}

}
