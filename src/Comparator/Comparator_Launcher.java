package Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Launcher {
	
	public static void main(String[] args) {
		
	
		List<ComparatorTest> l = getEmployees();
		/*
		 * Comapring the firstname
		 */
		// l.sort(Comparator.comparing(e -> e.getFirstName() ));
		// l.sort(Comparator.comparing(ComparatorTest::getFirstName));
		// Comparator<ComparatorTest>
		// comparator=Comparator.comparing(ComparatorTest::getFirstName);
		/*
		 * //Moren then values compare
		 */
		Comparator<ComparatorTest> comparator = Comparator.comparing(ComparatorTest::getId)
				.thenComparing(ComparatorTest::getFirstName);
		// l.sort(comparator.reversed());
		/*
		 * Parellel Processing
		 */
		ComparatorTest[] emp = l.toArray(new ComparatorTest[l.size()]);
		Arrays.parallelSort(emp, comparator);
		// l.sort(comparator);
		System.out.println(l);
	}

	private static List<ComparatorTest> getEmployees() {
		List<ComparatorTest> employees = new ArrayList();
		employees.add(new ComparatorTest(6, "Yash", "Chopra", 25));
		employees.add(new ComparatorTest(2, "Aman", "Sharma", 28));
		employees.add(new ComparatorTest(3, "Aakash", "Yaadav", 52));
		employees.add(new ComparatorTest(5, "David", "Kameron", 19));
		employees.add(new ComparatorTest(4, "James", "Hedge", 72));
		employees.add(new ComparatorTest(8, "Balaji", "Subbu", 88));
		employees.add(new ComparatorTest(7, "Karan", "Johar", 59));
		employees.add(new ComparatorTest(1, "Lokesh", "Gupta", 32));
		employees.add(new ComparatorTest(9, "Vishu", "Bissi", 33));
		employees.add(new ComparatorTest(10, "Lokesh", "Ramachandran", 60));
		return employees;
	}
}