package MethodReference;

public class MethodLaunch {

	static public void test() {
		
		System.out.println("Test Values ");
	}
	public static void main(String[] args) {
		
		I obj=MethodLaunch::test;
		obj.m1();
		
	}
}
