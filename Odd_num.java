package Mark;
import java.util.Scanner;
public class Odd_num {
		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			System.out.println("The odd numbers are");
			for(int i=1;i<=50;i++)
			{
				if(i%2==0)
				{
					continue;
				}
				else
				{
					System.out.println(+i);
				}
			}
		}
}

