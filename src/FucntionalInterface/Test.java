package FucntionalInterface;

public class Test  implements TestInterface1,TestInterface2{

	@Override
	public void dispaly1() {
		
		TestInterface1.super.dispaly1();
	}

}
