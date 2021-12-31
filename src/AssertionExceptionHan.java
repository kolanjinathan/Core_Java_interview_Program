
public class AssertionExceptionHan {
	
	static void test()throws Exception{
		
		if(true) {
			
		
			throw new AssertionError("Test1"); 
			
		}
	}
public static void main(String[] args) {
	AssertionExceptionHan ex=new AssertionExceptionHan();
	try {
		ex.test();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
