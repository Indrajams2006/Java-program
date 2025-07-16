package indraja;
import java.util.Scanner;
public class Range {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit:");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			System.out.println("The number:"+i);
		}
	}
}


