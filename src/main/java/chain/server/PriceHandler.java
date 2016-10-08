package chain.server;

/**
 * 价格处理人，负责处理客户折扣申请
 * @author zhangjiawei
 *
 */
public abstract class PriceHandler {
	
	//让子类都能访问到
	protected PriceHandler successor;
	
	/**
	 * 处理折扣申请
	 * @param discount 客户希望得到的折扣
	 */
	public abstract void processDiscount(float discount);
	
	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	
	
}
