import java.util.Scanner;
  public class IT24103039Lab7Q3	{
	public static void main(String[] args)	{
	
	//Creating a new Scanner class
	Scanner input=new Scanner(System.in);
	
	//Defining variables
	int total,num=1,customer;
	double discount=0,amount=0;
	char paymentMethod;
	
	//Creating a for loop
	for( customer=1;customer<=5;++customer)
	{
	   System.out.println("Customer " +customer);
	   System.out.print("Enter total bill amount: " );
	   total=input.nextInt();
	   System.out.print("Enter mode of payment (C for cash, O for other): " );
	   paymentMethod=input.next().toUpperCase().charAt(0);
	  
	if(paymentMethod=='C')
	   {
	     discount=total*5/100.0;
	     amount=total-discount;
	     System.out.println("Discount is : "+discount);
	     System.out.println("Amount to be paid is: "+amount);
	     System.out.println();
	   }
	   
	else if (paymentMethod=='O')
	   {
	      System.out.println("No discount applicable");
	      discount=0;
	      amount=total;
	      System.out.println("Amount to be paid is: "+amount);
	      System.out.println();
	      amount=total;
	   }	
	else
	   {
	      System.out.println("Payment Mode Is Not Valid ");	
	      System.out.println();
	      continue;
	   }
         }
     }
}
	 