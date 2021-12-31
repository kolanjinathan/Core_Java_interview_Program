package lamdaexpression;

public interface ThisFunction_Test {

	public abstract int m1();
}

class B {
	int a = 90;
}

class A extends B {
	int a = 222;

	public int test() {

		int a = 333;
		ThisFunction_Test i = () -> {
			//System.out.println("hello");
			return a;
		};

		int ii = i.m1();
		return ii;

	}

}