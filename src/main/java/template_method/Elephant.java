package template_method;

/**
 * 我是一只大象
 * @author zhangjiawei
 *
 */
public class Elephant extends FunnyJoke{
	
	/**
	 * 我要把大象放进冰箱
	 */
	@Override
	protected void putAnimalIntoFridge() {
		//力气还挺大的
		System.out.println("拿起大象，放进冰箱");
	}
}
