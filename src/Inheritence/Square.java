package Inheritence;

public interface Square {

	public default void cal(int x) {

		System.out.println("Square Values  "+x * x);
	}
}
