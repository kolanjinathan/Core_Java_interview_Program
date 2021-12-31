package Prdicate;

import java.util.Arrays;
import java.util.List;

import FucntionalInterface.Predicate;

public class PredicateStreamFilterTest {
	public static void main(String[] args) {
        
	      List<String> names = Arrays.asList(
	         "Peter",
	         "Martin",
	         "Alex",
	         "Philip",
	         "Piyush",
	         "Mike"
	        );
	
	Predicate<String>p=name->name.startsWith("P");
	//names.stream().filter(p).forEach(System.out::println);
	}
}
