
/*Write a program to accept choise from user and perform the operation:
  1.Factorial
  2.sum of digit
  3.Armstrong number or not
  4.Fibonacci series
  5.Prime or not */



import java.util.*;
public class Question2 
{
	public static void main(String[] args) 
	{
		int r,sum=0,og,ch,x,y;
		Scanner sc=new Scanner(System.in);	
	
			System.out.println("Enter choice:\n1:Factorial  \n2:sum of digit \n3:Armstrong number or not \n4:Fibonacci series \n5:Prime or not");
                         ch=sc.nextInt();
			
			//num=sc.nextInt();//
			switch(ch)
			{
			case 1:
				int num=10;
				long factorial=1;
				System.out.println("Enter number");
                                for(int i=1;i<=num;++i)
				{
					factorial *=1;
				}
				System.out.println("factorial of "+factorial); 
				break;
			case 2:
 				System.out.println("Enter your Number");
               	           	 num = sc.nextInt();
             		        while (num > 0)
				 {
                                int n = num % 10;
                   		 sum = sum + n;
                	        num = num / 10;
                                 }
               			 System.out.println("Sum of Digit:" + sum);
				break;
			case 3:
				
                 		System.out.println("Enter number");
   				num=sc.nextInt();
				og=num;
 				do
				{
					r=num % 10;
					sum=sum+(r*r*r);
     					num=num/10;
  				}
				while(num>0);
				if(sum==og)
   				{
					System.out.println("It is Armstrng no");
				}
				else
				{
 					System.out.println("It is not Armstrng no");
				}
				break;
			case 4:
				System.out.println("Enter the first number :");
                		int n=sc.nextInt();
                		System.out.println("Enter the second number :");
                		int number=sc.nextInt();
                		int b;
                		int count=10;
                		for(int i=2;i<count;i++)
                		{
                    			b=n+number; 
                    			System.out.println("the fibonacci series of given numberis "+b);
                   		 	n=number; 
                    			number=b; 
               			 }
				break;
			case 5:
				System.out.println("Enter the number :");
                		int num1=sc.nextInt(); 
                		int temp1=0,m=0;
               		 	m=num1/2; 
                		if(num1==0||num1==1) 
                		{
                    			System.out.println("A number is not prime number :" + num1);
                		}
                		else 
				{
                    			for(int i=2;i<=m;i++) 
                    			{
                        			if(num1%i==0) 
                        			{
                            				System.out.println("A number is not prime number :"+num1);
                            				temp1=1;
                            				break;
                        			}
                   			 }
                    		if(temp1==0)
                    		{
                        		System.out.println("A number is a prime number :"+num1);
                    		}
				}
			default:
			System.out.println("enter correct choise");
			}
			

	}

}