package Array_Example;

import java.util.HashSet;
import java.util.Set;

public class SumIsGivenNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9 };
		printPairsUsingSet(arr,6);
	}

	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		Set set = new HashSet(numbers.length);
		for (int value : numbers) {
			int target = n - value;
        // if target number is not in set then add
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	}
}
