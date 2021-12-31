package HiherOrderFuntional;

public class Launcher {
	public static void main(String[] args) {
		
		I i=()->{return 111;};
		J j=()->{return 222;};
		k kk=(I ii,J jj)->{
			
			System.out.println(ii.m1()+jj.m2());
		};
		kk.m3(i, j);
	}

}
