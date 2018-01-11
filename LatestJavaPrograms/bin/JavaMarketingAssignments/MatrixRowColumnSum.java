package JavaMarketingAssignments2;

import java.util.Scanner;

public class MatrixRowColumnSum {

	public static void main(String[] args) {
		
		int matrix[][]=new int[3][3];
		int rowsum[]=new int[3];
		int colsum[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter matrix values rowwise");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				rowsum[i]=rowsum[i]+matrix[i][j];
			}
		}
		System.out.print("ROW SUM IS ::");
		for(int i=0;i<3;i++)
		{
			System.out.print( rowsum[i] + " ");
		}

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				colsum[i]=colsum[i]+matrix[j][i];
			}
		}
		System.out.print("Column SUM IS ::");
		for(int i=0;i<3;i++)
		{
			System.out.print( colsum[i] + " ");
		}
		
		
		
	}

}
