import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternValue {

	public static void main(String[] args) {
		String st="she sells sea shells";
		String res="s";
		String replace="xx";
		Pattern pa=Pattern.compile(res);
		Matcher m=pa.matcher(st);
		String val=m.replaceAll(replace);
		System.out.println(val);
	}
}
