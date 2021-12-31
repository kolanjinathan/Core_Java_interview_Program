package Array_Example;
import java.util.Arrays;

public class SecondLargetArralyElment {

	public static void main(String[] args) {
		Integer a[]= {1,3,2,6,4,7,5,8,9};
		int size=a.length;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int aa= a[size-2];
		System.out.println(aa);
	}
}
