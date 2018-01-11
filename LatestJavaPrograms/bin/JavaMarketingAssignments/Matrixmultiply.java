package JavaMarketingAssignments2;

import java.util.Scanner;

public class Matrixmultiply {

	public static void main(String[] args) {
		
		int mat1[][]=new int[3][3];
		int mat2[][]=new int[3][3];
		int mat3[][]=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		System.out. println("Enter 1st Matrix values row wise");
		for(int i=0;i<3;i++)
		{
		   for(int j=0;j<3;j++)
		   {
			  mat1[i][j] =sc.nextInt();
		   }
		}
		System.out. println("Enter 2nd Matrix values row wise");
		for(int i=0;i<3;i++)
		{
		   for(int j=0;j<3;j++)
		   {
			  mat2[i][j] =sc.nextInt();
		   }
		}
		for(int i=0;i<3;i++)
		{
		   for(int j=0;j<3;j++)
		   {
			   for(int k=0;k<3;k++)
			   {
			  mat3[i][k] = (mat1[i][k] * mat2[k][j]);
			   }
		   }
		}
		 System.out.println(" Multiplication of Matrix" );
		
		 for(int i=0;i<3;i++)
			{
				System.out.println(" ");
			   for(int j=0;j<3;j++)
			   {
				   
				  System.out.print(mat1[i][j]) ;
				  
			   }
			}
		 for(int i=0;i<3;i++)
			{
				System.out.println(" ");
			   for(int j=0;j<3;j++)
			   {
				   
				  System.out.print(mat2[i][j]) ;
				  
			   }
			}
		 
		 
		 
		 
		 
		for(int i=0;i<3;i++)
		{
			System.out.println(" ");
		   for(int j=0;j<3;j++)
		   {
			   
			  System.out.print(mat3[i][j]) ;
			  
		   }
		}

		
		
		
	}

}
