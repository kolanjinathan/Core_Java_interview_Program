import java.util.Scanner;

public class Alphabetornot_input {
	public static void main(String args[]){
		char ch;//local variable
		Scanner scan=new Scanner(System.in);
		//takes input from the user
		System.out.print("Enter an character: ");
		//get input and it is stored ch variable
		ch=scan.next().charAt(0);
		if((ch>=97 && ch<=122)||(ch>=65 && ch<=90)){
		System.out.print(ch+" is an Alphabet: ");
		}
		else
		{
		System.out.print(ch+" is not an Alphabet: ");
		}
		}
}
