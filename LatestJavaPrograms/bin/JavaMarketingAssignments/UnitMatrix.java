package JavaMarketingAssignments2;

import java.util.Scanner;

public class UnitMatrix {

	public static void main(String[] args) {
		
		int matrix[][]= new int[3][3];
		System.out.println("Enter Matrix Values");
		Scanner sc=new Scanner(System.in);
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
				 while(i==j)
				 {
					if(matrix[i][j]==1)
						break;
					else
						System.out.println("Not Unit Matrix");
					break;
					  	
				  }
			  while(i!=j)
			  {
				  if(matrix[i][j]==0)
					  break;
				  else
					  System.out.println("Not Unit Matrix");
				  break;
				  	
			  }
			  
			  
			    }
		}
		System.out.println("YES,IT IS UNIT MATRIX");
		   
		
		
		
	}

}
