package String;

public class JoiningString {
public static void main(String[] args) {
	
	//String st=String.join(",", "Kolanji","apple","block");
	//System.out.println(st);
	
	String[] strArray = { "How", "To", "Do", "In", "Java" };
    
	String joinedString = String.join(", ", strArray);
	System.out.println(joinedString);
}

}
