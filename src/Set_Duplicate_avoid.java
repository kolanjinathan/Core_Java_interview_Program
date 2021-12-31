import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Set_Duplicate_avoid {

	public static void main(String[] args) {
		
		HashSet<TestSetPojo> s=new HashSet<>();
		s.add(new TestSetPojo("1","kolanji"));
		s.add(new TestSetPojo("2","rathna"));
		
		s.add(new TestSetPojo("3","anand"));
		s.add(new TestSetPojo("4","vel"));
		
		List<TestSetPojo>list=new ArrayList(s);
		//Collections.sort(list);
		
		
	}
}
