import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Test {

	public static void main(String[] args) {
		
		
		ArrayList list=new ArrayList(12);
		System.out.println("li"+list.size());
		list.add("1");	
		list.add("1");	
		list.add("1");	
		list.add("1");	
		System.out.println("li"+list.size());
		File f=new File("C://TEXT.txt");;
		
		
		List l=new ArrayList();
		for(int i=0;i<1;i++) {
			System.out.println("ArrayList count"+i);
			//l.add(i);
		}
		//l.add(500,"kolanji");
		
		System.out.println(l.get(500));
	}
	
	
}
