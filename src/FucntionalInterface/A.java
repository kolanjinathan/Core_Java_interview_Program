package FucntionalInterface;

public interface A {
default void dispaly() {
	
	System.out.println("Super Interface");
	
	if(this instanceof B) {
		((B) this).display2();
		
	}
}
}
