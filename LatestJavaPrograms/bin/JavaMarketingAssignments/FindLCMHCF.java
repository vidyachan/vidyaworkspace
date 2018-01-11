package JavaMarketingAssignments2;

import java.util.Scanner;

public class FindLCMHCF {

	public static void main(String[] args) {
		
		int x,y,a,b,lcm,hcf,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers::");
		x=sc.nextInt();
		y=sc.nextInt();
		a=x;
		b=y;
		while(b!=0)
		{
			t=b;
			b=a%b;
			a=t;
		}
		hcf=a;
		lcm=(x*y)/hcf;
		System.out.println("HCF...." +hcf);
		System.out.println("LCM...." +lcm);
	}

}
