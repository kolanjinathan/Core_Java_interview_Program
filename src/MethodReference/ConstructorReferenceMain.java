package MethodReference;

public class ConstructorReferenceMain {
public static void main(String[] args) {
	Messageable ms=ConstructorReference::new ;
	ms.getMessage("Hello");
	
	
}
}
