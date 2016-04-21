package template_method;

/**
 * 我是一只猫
 * @author zhangjiawei
 *
 */
public class Cat extends FunnyJoke{

	@Override
	protected void putAnimalIntoFridge() {
		System.out.println("拿起猫，放进冰箱");
	}
	
	/**
	 * 猫太轻了，搬完一点都不累，我不想睡觉
	 */
	@Override
	protected boolean isHeavyAnimal() {
		return false;
	}
}
