package JavaMarketingAssignments2;

import java.util.Scanner;

public class EvenOddMatrix {

	public static void main(String[] args) {
		int matrix[][]=new int[3][3];
		int evencount=0;
		int oddcount=0;
		System.out.println("Enter matrix values");
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
				int b=matrix[i][j];
				if(b%2==0)
                   evencount++;
                   else
                	   oddcount++;
					
			}
		}
		System.out.println("even numbers  " +evencount);
		System.out.println("odd numbers  " +oddcount);
		
	}
	

}
