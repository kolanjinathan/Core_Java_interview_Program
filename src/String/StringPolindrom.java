package String;

public class StringPolindrom {
	public static void main(String[] args) {
		String st = "101";
		String revese = reverse(st);

		if (st.equals(revese)) {
			System.out.println("polindrom : " + revese);
		}
	}

	public static String reverse(String source) {

		String reverse = "";
		if (source == null || source.isEmpty()) {

			return source;
		}
		for (int i = source.length() - 1; i >= 0; i--) {

			System.out.println("reverse: " + reverse);

			reverse = reverse + source.charAt(i);
		}

		return reverse;
	}

}
