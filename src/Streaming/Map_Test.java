package Streaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map_Test {
	
	
	

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		
		list.add(10);
		list.add(10);
		

		Stream<Integer> st=list.stream().map((x)->(x*x));
		List<Integer> l=st.collect(Collectors.toList());
		System.out.println("List values "+l);
		
		//List words= Arrays.asList("JavaDevJournal","Java");
		
		List words= Arrays.asList("JavaDevJournal","Java","nathan");
		words.stream().map( s-> ((String) s).split("")).distinct().collect(Collectors.toList());
		
		System.out.println(words);
	}
}
