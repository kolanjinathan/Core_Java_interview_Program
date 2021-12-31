
public class TestArray {
	public static void main(String[] args) {

		int j[] = new int[5];
		System.out.println(j);

		int ii = 2;
		int k = ++ii;
		System.out.println(k);

		double num[] = { 5.5, 10, 1, 11, 12, 8 };
		double result;
		result = 0;
		for (int i = 0; i < 6; ++i) {
			result = i;
		}
		System.out.println(num[1]);
		result = result + num[1];
		System.out.println(result);
	}
}
