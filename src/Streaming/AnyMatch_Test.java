package Streaming;

import java.util.ArrayList;
import java.util.stream.Stream;

public class AnyMatch_Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("corejava advancedjava orcle");
		list.add("NIIT KANPUR");
		list.add("iit chennai");
		list.add("values  chennai");
		Stream <String>st=list.stream();
		//boolean b=st.anyMatch((x)->{return x.startsWith("c");
		//boolean bb=st.allMatch(((xx)->{return xx.startsWith("c");
		boolean c=st.noneMatch((x)->{return x.startsWith("c");
		
		
		
		});
		System.out.println(c);

	}
}
