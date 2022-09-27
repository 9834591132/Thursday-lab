/*Write a program to accept a number from the user and check if a number is palindrome or not.*/
	import java.util.*;
	public class Question1 
	{
  		public static void main(String args[])
  		{
    			Scanner sc=new Scanner(System.in);
    			System.out.println("enter number.");
    			int n=sc.nextInt();
    			int rev=0,r;
    			int og=n;
    			while(n>0);
     			{
       				r=n % 10;
       				rev=(rev*10)+r;
       				n=n/10;
     			}
    			if(og==rev)
     			{
       				System.out.println("It is Palindrome");   
     			}
    			else
      			{
       				System.out.println("It is not palindrome"); 
      			}
    		} 
	}