package JavaMarketingAssignments2;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		int matrix1[][]=new int[2][2];
		int matrix2[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter matrix values");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			   matrix1[i][j]=sc.nextInt();
			}
		  }
		System.out.println("Original Matrix");
		for(int i=0;i<2;i++)
		{System.out.println(" ");
			for(int j=0;j<2;j++)
			{
			   System.out.print(matrix1[i][j]);
			}
		  }
		System.out.println("Transpose Matrix");
		for(int j=0;j<2;j++)
		{ System.out.println(" ");
			for(int i=0;i<2;i++)
			{
				System.out.print(matrix1[i][j]);
			}
		  }
		
		
		
		
		
		
		
		}

	}


