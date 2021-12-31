package String;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseWord {
	public static void main(String[] args) {

		String values = "Hello Java";
		Stack stack = new Stack();
		StringBuilder stringBuilder = new StringBuilder();
		StringTokenizer stringTokenizer = new StringTokenizer(values, " ");
		while (stringTokenizer.hasMoreTokens()) {

			stack.push(stringTokenizer.nextToken());
		}
		while (!stack.isEmpty()) {

			stringBuilder.append(stack.pop());

		}
		System.out.println(stringBuilder.toString());
	}
}
