package ALGORITHM;

import java.util.Stack;

public class BalancedString {

	public static char[][] TOKENS = { { '{', '}' }, { '[', ']' }, { '(', ')' } };

	public static boolean isBalanced(String expression) {
		

		Stack<Character> stack = new Stack<Character>();

		System.out.println("Key"+expression.toCharArray());
		for (char c : expression.toCharArray()) {

			System.out.println("expression value s" + c);

			if (isopenTerm(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty() || matches(stack.pop(), c)) {
System.out.println("Else ");
					return false;
				}

			}
		}

		return stack.isEmpty();
	}

	public static boolean isopenTerm(char c) {

		for (char[] array : TOKENS) {
			
			if (array[0] == c) {
				System.out.println("isopen" + c);
				return true;
			}
		}
		return false;

	}

	public static boolean matches(char openTerm, char closeTerm) {
		for (char[] array : TOKENS) {

			if (array[0] == openTerm) {
				System.out.println("pop" + closeTerm);
				return array[1] == closeTerm;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		String input = "{}()";
		boolean b = isBalanced(input);
		System.out.println("boolean valance values " + b);
	}
}
