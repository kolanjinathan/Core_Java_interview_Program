
public class Student {

	public static void main(String[] args) {
		System.out.println("Student entry");

		synchronized (args) {
			System.out.println();
			try {
				args.wait();
			} catch (InterruptedException e) {

				System.out.println(e);
			}
		}
	}
}
