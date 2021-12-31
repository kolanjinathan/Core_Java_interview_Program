package Comparator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Construct_Call_Private {
public static void main(String[] args) {
	
	try {
		Class cc=Class.forName("Constructor_Private");
		
		Constructor con[]=cc.getDeclaredConstructors();
		con[0].setAccessible(true);
		try {
			con[0].newInstance(null);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
