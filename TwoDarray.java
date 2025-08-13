package indraja;

import java.util.Scanner;

public class TwoDarray {
	public static void main(String[] args) {
		int[][]matrix = new int[4][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the matrix");
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j]=sc.nextInt();
			}
						
			}
		System.out.println("Elements are");
		
			for(int i=0;i<4;i++) {
				for(int j=0;j<3;j++) {
					
				
					System.out.println(matrix[i][j]+"\t");
				}
				System.out.println();
			
		
		}
		
		
	}
}

	


