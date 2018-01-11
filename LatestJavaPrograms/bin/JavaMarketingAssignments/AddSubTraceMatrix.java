package JavaMarketingAssignments2;

import java.util.Scanner;

public class AddSubTraceMatrix {

	public static void main(String[] args) {
		int matrix1[][] =new int[3][3];
		int matrix2[][]=new int[3][3];
		int matrix3[][]=new int[3][3];
		int matrix4[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter 1st Matrix");
			for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				  matrix1[i][j]=sc.nextInt();
			}
		}
			System.out.println("ENter 2 nd Matrix");
			for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				  matrix2[i][j]=sc.nextInt();
			}
		}
			System.out.println("Addition of Matrix");
			for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				  matrix3[i][j]=matrix1[i][j] + matrix2[i][j];
			}
		}
			for(int i=0;i<3;i++)
				{ System.out.println(" ");
				for(int j=0;j<3;j++)
				{
					 System.out.print( matrix3[i][j]);
				}
			}
			System.out.println("TRACE OF A MATRIX");
			int sum=0;
			for(int i=0;i<3;i++)
			{ System.out.println(" ");
			for(int j=0;j<3;j++)
			{
				if(i==j)
				sum=sum+ matrix3[i][j];
			}
		}
			 System.out.println(sum);
			
			
				System.out.println("Subtraction of Matrix");
				for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					  matrix4[i][j]=matrix1[i][j] - matrix2[i][j];
				}
			}
				for(int i=0;i<3;i++)
					{ System.out.println(" ");
					for(int j=0;j<3;j++)
					{
						 System.out.print( matrix4[i][j]);
				}

	}
	}
}

