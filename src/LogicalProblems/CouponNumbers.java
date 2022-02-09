package LogicalProblems;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many Unique Coupon Code do you want: ");
		int coupon=sc.nextInt();

		Random random=new Random();
		int counter=0;
		int array[]=new int[coupon];
		int i=0;

		while(true)
		{
			if(i==coupon)
				break;

			boolean test=true;
			int num=random.nextInt(1000000);
			for(int j=0; j<array.length;j++)
			{
				if(array[j]==num)
				{
					test=false;
					break;

				}
			}
			if(test == true)
			{	
				array[i]=num;
				i++;
			}
			counter++;

		}
		System.out.println("Total number of random numbers required to generate distinct coupon code= "+counter);
		System.out.println("The distinct coupon codes are:");
		for(int k=0;k<array.length;k++)
			System.out.println(array[k]);

		sc.close();
	}
}
