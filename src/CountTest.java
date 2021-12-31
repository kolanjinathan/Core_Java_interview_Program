import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountTest {

	public static void main(String[] args) {
		final CountTest co=new CountTest();
		//co=new CountTest(); //The final local variable co cannot be assigned. It must be blank and not using a compound assignment
		 
		 
		 System.out.println(co.hashCode());
		// System.out.println(co1.hashCode());
		List l=new ArrayList();
		l.add(21);
		l.add(22);
		
		l.add(23);
		l.add(34);;
		
		Stream<Integer> st=l.stream();
				Stream<Integer>ll=	st.filter((x)->x % 2==0);
				System.out.println(ll.count());
	}
}
