import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("optional");
		l.add("rathna");
		
		l.add("naresh");
		l.add("sam");
		l.add("Ajay");
		
		Stream st1=l.stream();
		
		/*
		 * 
		 * Optional op=st1.reduce( (x,y)->{ return x+y; } );
		 */
		List ll=new ArrayList();
		ll.add(21);
		ll.add(22);
		
		ll.add(23);
		ll.add(34);
		Stream st2=ll.stream();
		Stream ss=Stream.concat(st1, st2);
		ss.forEach((x)->{System.out.println(x);});
		
		
	}
}
