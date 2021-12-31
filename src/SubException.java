
public class SubException extends TestException {
	void too() {
		
		System.out.println("Values B");
	}
	public static void main(String[] args) {
		SubException b=new SubException();
		b.too();
	}

}
