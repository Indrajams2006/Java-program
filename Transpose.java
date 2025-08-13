package indraja;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows=sc.nextInt();
		System.out.println("enter the no of cols:");
		int cols=sc.nextInt();
		int[][]matrix=new int[rows][cols];
		int[][]transpose=new int[cols][rows];
		System.out.println("Enter the matrix elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println(" matrix is: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println(matrix[i][j]+"\t");
		
	}
			System.out.println();
}
	
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				transpose[j][i]=matrix[i][j];
				
			}
			
			
		}
		
		System.out.println("the transpose matrix is: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println(transpose[i][j]+"\t");
		
	}
			System.out.println();
}
	}
}

