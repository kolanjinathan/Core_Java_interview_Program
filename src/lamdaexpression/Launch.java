package lamdaexpression;

public class Launch {

	static void  m1(I i) {
		System.out.println(i.area(89));
		
	}
	public static void main(String[] args) {
		
		I a=  (int x)->{
			return x*x;
			};
		m1(a);
	}
	
}
