package FucntionalInterface;

public class FucntionalLaunch implements I {

	@Override
	public void m1() {
		System.out.println("display parent import ");

	}

	public static void main(String[] args) {

		I obj = new FucntionalLaunch();
		obj.m1();
		obj.m2();
		I.m4();
		I.m4();

		// Just testing lambda expression

		I obj1 = () -> System.out.println("Gahe");
		obj1.m2();
	}

}
