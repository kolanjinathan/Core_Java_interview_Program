import java.io.File;
import java.io.IOException;

public class FileCreation {
public static void main(String[] args) {
	File f=new File("C:\\test.txt");
	try {
		f.createNewFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
