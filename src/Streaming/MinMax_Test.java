package Streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMax_Test {
	public static void main(String[] args) {
		
		
		String st="kolanji";
		
		char c=st.charAt(st.length()-1);
		System.out.println(c);
		
		String cc=st.substring(0,st.length()-1);
		System.out.println("values "+cc);
		
		List<String> l=new ArrayList();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		l.add("5");
		
		Stream<String> ll=l.stream();
		//Optional<String> o=l.stream().max((x,y)->{return x.compareTo(y);});
		Optional<String> o=ll.min((x,y)->{return x.compareTo(y);});
		
		if(o.isPresent()) {
			
			System.out.println("Values "+o.get());
		}
		String val="kolanji";
		String finalrev=MinMax_Test.reverse(val);
		
		if(finalrev.equals(val)) {
			
			System.out.println("yes");
		}else {
			
			System.out.println("false");
		}
		
	}
	
	public static String reverse(String value) {
		
		//char c=value.charAt(value.length()-1);
		
	//String st=value.substring(0,value.length()-1);
		
		
		return value.charAt(value.length()-1)+ reverse(value.substring(0,value.length()-1));
		
	}



}



