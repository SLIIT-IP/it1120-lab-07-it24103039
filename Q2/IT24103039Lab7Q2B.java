import java.util.Scanner;
public class IT24103039Lab7Q2B	{
	public static void main(String[] args)	{
		
	//Creating a new Scanner class
	Scanner input=new Scanner(System.in);
	
	//Defining the variables
	int	rowCounter,columnCounter;
	
	//Creating the for loop
	for(rowCounter=1;rowCounter<=5;rowCounter++)
	   {
	     System.out.print(rowCounter + "-");
			
	  for(columnCounter=1;columnCounter<=rowCounter;columnCounter++)
	     {
		System.out.print("*");
		}
 		System.out.println();
		}
	
	}
}