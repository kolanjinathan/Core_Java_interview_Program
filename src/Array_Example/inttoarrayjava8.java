package Array_Example;

public class inttoarrayjava8 {
public static void main(String[] args) {
	int num = 1234567;
    int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
    for(int d : digits)
        System.out.print(d);
}
}
