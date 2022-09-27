//WAP to create a menu for food counter and accept the item from the user and display the final bill amount with the itam is ordered
import java.util.*;
public class Question3
{
	public static void main(String[] args) 	
	{
		int menu,menu1 = 0,total=0, price = 0;
		char ans;
		Scanner sc=new Scanner(System.in);
			do 
			{ 
				System.out.println("Welcome to My Hotel");
				System.out.println("1.Non veg");
				System.out.println("2.veg");
				System.out.println("3 Desert");
				System.out.println("Please enter your menu :");
				menu=sc.nextInt();
				switch(menu) 	
				{ 
					case 1:
						System.out.println("1.chicken Hundi");
						System.out.println("2.Mutton Thali");
						System.out.println("3.Kabab");
						System.out.println("please select your menu");
						menu1=sc.nextInt(); 
						break;
		
					case 2:	
						System.out.println("1.veg panner handi");
						System.out.println("2.Mix veg");
						System.out.println("3.Soya chap");
						System.out.println("please select your menu");
						menu1=sc.nextInt();  
						break;
		
					case 3:	
						System.out.println("1.Ice-Cream");
						System.out.println("2.Milk Shake");
						System.out.println("3.faluda");
						System.out.println("please select your menu");
						menu1=sc.nextInt();  
						break;	
	
					default :
						System.out.println("Please select your order properly");
				}
	
				if(menu==1) 
				{ 
		 			if(menu1==1)
	 					{ 
							System.out.println("chicken Hundiis : 180rs ");
							price=180;
	    					}
		 
		 			else if(menu1==2) 
						{ 
			 				System.out.println("Mutton Thali : 300rs");
			 				price=300;
		 				}
		 			else if(menu1==3) 
						{ 
			 				System.out.println("Kabab is : 170rs");
			 				price=170;
		 				}
		 			else 
						{
			 				System.out.println("sorry select correct option");
		 				}
				}
				else if(menu==2) 
				{
			 
					if(menu1==1) 
					{ 
						System.out.println("veg panner handi is : 120 rs");
						price=120;   	
			 		}
				 
					else if(menu1==2) 
					{ 
					 	System.out.println("Mix veg is : 160rs");
					 	price=160;
				 	}
				 
					else if(menu1==3) 
					{ 
					 	System.out.println("Soya chap is : 170rs");
					 	price=170;
				 	}
				 
					else 
					{
					 	System.out.println("sorry select correct option");
					 }
				}
				else 
				{
			 		if(menu1==1) 
					{ 
					  	System.out.println("Ice-Cream : 100rs ");
					  	price=100;   	
			 		}
				 	else if(menu1==2) 
					{ 
					  	System.out.println("Milk Shake is : 130rs");
					 	price=130;
				 	}
				 	else if(menu1==3) 
					{ 
					  	System.out.println("faluda is : 100rs");
					  	price=100;
				 	}
				 	else 
					{
					 	System.out.println("sorry select correct option");
				 	}
				}
			System.out.println("If you want order anythink please press y:");
   			total=total+price; 
			ans=sc.next().charAt(0);
			if(ans!='y'||ans!='Y') { 
			System.out.println("The total bill is :"+total+" Rs");
			}
	
		}
			while(ans=='y'||ans=='Y'); 
    
    			System.out.println("Thank you visit again");
	}
}