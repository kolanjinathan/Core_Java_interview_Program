package Array_Example;
import java.util.Arrays;

public class FindingMissingNumber {
public static void main(String[] args) {
	
	int missingNum[]= {1,2,3,4,5,6,7,8,9,11,12,13,15};
	int N=missingNum.length;
	System.out.println("values "+N);
	
	int ideal=(N*(N+1)/2);
	int sum=0;      //Arrays.stream(missingNum).sum();
	for(int i=0;i<N-1;i++) {
		sum+=missingNum[i];
		
	}
	
	
	System.out.println("sum"+sum);
	int result=ideal-sum;
	System.out.println(result);
}
}
