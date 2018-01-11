package JavaMarketingAssignments2;

import java.util.Scanner;

public class SparseMatrixTest {

	public static void main(String[] args) {
		int matrix[][]=new int[3][3];
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter matrix values");
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
				int b=matrix[i][j];
				if(b==0)
					count++;
			}
		}
		if(count>5)
			System.out.println("IT IS SPARSE MATRIX");
		else
			System.out.println("IT IS SPARSE MATRIX");
		
		
		

	}

}
