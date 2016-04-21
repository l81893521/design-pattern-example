package template_method;

/**
 * 这是一个搞笑的例子
 * 我们通过使用模板方法模式去模拟怎么样把一只动物(大象)放进冰箱
 * 为什么需要使用模板方法模式，因为在我们的应用中，有一些业务功能，它要按一定的顺序去执行一些功能,顺序也不允许被改变
 * 其中某一步可能存在不同的处理方法，我们可以交给不同的子类去实现
 * 所以我们使用模板方法模式
 * @author zhangjiawei
 *
 */
public abstract class FunnyJoke {
	
	/**
	 * 这是一个模板方法
	 * 添加final关键字，预防子类去更改它的调用顺序
	 * 我们通过3个步骤把动物放进冰箱
	 * 1.打开冰箱
	 * 2.把动物放进冰箱
	 * 3.关闭冰箱
	 * 4.去睡觉（不是说3步吗？怎么出来了个第4步?其实这是可选的,请看{@link #isHeavyAnimal()})
	 */
	public final void putAnimalIntoFridgeTemplate(){
		//打开冰箱
		openFridge();
		//放进动物
		putAnimalIntoFridge();
		//关闭冰箱
		closeFridge();
		//如果动物太重，就需要睡觉
		if(isHeavyAnimal()){
			//睡觉
			gotoSleep();
		}
	}
	
	/**
	 * 这是一个钩子方法
	 * 它已经实现了(当然也可以为空)，同时也允许子类去复写它,所以使用protected关键字
	 * 具体的子类可以选择是否挂钩，以及如何挂钩
	 * 解析一下，钩子方法(想象成一个货柜)通常会在基类中提供一个空或者默认的实现
	 * 如果子类复写这个方法,也就是挂钩(想象成把货柜勾起来)
	 * 如果子类不管这个方法,也就是不挂钩(让货柜继续在地上)
	 * 
	 * @return
	 */
	protected boolean isHeavyAnimal() {
		return true;
	}
	
	/**
	 * 第一步：打开冰箱
	 */
	private void openFridge(){
		System.out.println("打开冰箱");
	}
	
	/**
	 * 第二步：把动物放进冰箱
	 * 由于业务关系，我们放什么动物进冰箱，目前还不知道，所以我们把这个方法留给子类去实现
	 */
	protected abstract void putAnimalIntoFridge();
	
	/**
	 * 第三步：关闭冰箱
	 */
	private void closeFridge(){
		System.out.println("关闭冰箱");
	}
	
	/**
	 * 第四步：睡觉
	 */
	private void gotoSleep() {
		System.out.println("动物太重了，搬死我了，先睡一会。");
	}
}
