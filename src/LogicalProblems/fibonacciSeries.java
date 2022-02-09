package LogicalProblems;

import java.util.Scanner;

public class fibonacciSeries{
	public static int n = 0;
	public static int f = 0;
	public static int s = 0;
    
    static void findSeries()
    {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Nth limit ");
    	n=sc.nextInt();
    	
    	System.out.println("Enter First Number ");
    	f=sc.nextInt();
    	
    	System.out.println("Enter Second Number ");
    	s=sc.nextInt();
    	
        System.out.print(f + " "+ s + " ");
        int counter = 0, sum;
     
        
        while (counter < n - 2)
        {
            sum = f + s;
            System.out.print( sum + " ");
            f = s;
            s = sum;
            counter++;
        }
        sc.close();
    }
     
    
    public static void main (String[] args)
    {
        
		findSeries();
    }
}