package Thread;

public class Sleep_Test {
public static void main(String[] args) throws InterruptedException{
	for(int i=0;i<10;i++) {
		
		System.out.println("Main -"+Thread.currentThread().getName());
		Thread.sleep(3000);
	}
}
}
