import java.util.Scanner;

public class IT24103039Lab7Q1B {
    public static void main(String[] args) {

	//Create an object called input to scanner class
        Scanner input = new Scanner(System.in);
        
        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");
            
        // Get four subject marks in one line, separated by space
        int mark1 = input.nextInt();
        int mark2 = input.nextInt();
        int mark3 = input.nextInt();
        int mark4 = input.nextInt();
            
        // Calculate average
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
        System.out.println("Average is: " + average);
            
        // Determine grade based on average
        if (average >= 75&&average<=100) 
		{
	System.out.println("Overall Grade is: Distinction");
            }
		else if (average >= 50 && average<=74) 
		{
                System.out.println("Overall Grade is: Credit");
            }
		else if(average >=0 && average<=49)
		{
                System.out.println("Overall Grade is: Fail");
            }
			
		else
		{
		System.out.println("Invalid input");
            
			}
            System.out.println();
        }
		
		
		
        
        
    }
}