package Array_Example;

public class ReverseOnArray {
public static void main(String[] args) {
	int a[]= {10,4,2,5,9,8,7};
	reverse(a);
}

public static  void reverse(int[] arra) {
	
	for(int i=0;i<arra.length/2;i++) {
		
		int other=arra.length-i-1;
		int temp=arra[i];
		arra[i]=arra[other];
		arra[other]=temp;
		
		
	}
	for (int a:arra) {
		System.out.println(a);
	}
	
}
}
