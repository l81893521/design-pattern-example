package template_method;

public class Test {
	
	public static void main(String[] args) {
		FunnyJoke elephant = new Elephant();
		elephant.putAnimalIntoFridgeTemplate();
		System.out.println("----------------------------------");
		//搬猫只需要3部，猫太轻了，不用睡觉
		FunnyJoke cat = new Cat();
		cat.putAnimalIntoFridgeTemplate();
	}
}
