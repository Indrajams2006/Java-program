package indraja;
import java.util.Scanner;
public class Signchecker {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		if(number>0) {
		
			System.out.println("The number:"+number+"is positive");
					}
			else {
				System.out.println("The number:"+number+"is negative");
		}
	}
}
