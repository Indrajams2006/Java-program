package indraja;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int[]array= new int[10];
		Scanner sc=new Scanner(System.in);for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
		System.out.println("Enter the elements");
		
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
			
		}
		
		for(int num:array) {
			System.out.print(num+"\t");
			
		}
	}

}
