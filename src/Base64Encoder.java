import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;

public class Base64Encoder {
//a29sYW5qaQ==
	public static void main(String[] args) {
		String normalString = "a29sYW5qaQ==";
		//String normalString = "kolanji";
		Base64.Encoder encoder=Base64.getEncoder();
		String encodedString = encoder.encodeToString( 
		        normalString.getBytes(StandardCharsets.UTF_8) );
		
		//System.out.println(encodedString);
		
		//Decode Example
		Decoder decode=Base64.getDecoder();
		byte[] decodedByteArray = decode.decode(normalString);
		//Verify the decoded string
		System.out.println(new String(decodedByteArray));
		
		//Base64Decoder d=new Base64Decoder();
	}
}
