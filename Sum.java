package indraja;
import java.util.Scanner;
public class Sum {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number1:");
		int number1=sc.nextInt();
		System.out.println("Enter a number2:");
		int number2=sc.nextInt();
		int number3=number1+number2;
		System.out.println("the sum is:"+number3);
	}
}	