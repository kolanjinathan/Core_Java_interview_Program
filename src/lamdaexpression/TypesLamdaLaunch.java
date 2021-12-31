package lamdaexpression;

public class TypesLamdaLaunch {
	public static void main(String[] args) {
		
		One i=()->{System.out.println("void Type Test");};
		i.m1();
		Two j=(int x)->{System.out.println("Void with param"+x);};
		j.m2(10);
		Three k=()->{return 234;};
		k.m3();
		four l=( x)->{ return x*x;};
	int ii=	l.m4(10);
	System.out.println("Void with param"+ii);	
	}

}
