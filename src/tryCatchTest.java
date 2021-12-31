
public class tryCatchTest {

	private tryCatchTest() {
	}

	public static void main(String[] args) {
		try {
			System.out.println("try one");
			try {
				System.out.println("try two");
			} catch (NullPointerException npe) {
				System.out.println("catch one");
			} catch (Exception e) {
				System.out.println("catch two");
			}
		} finally {
			System.out.println("finally");
		}
	}

}
