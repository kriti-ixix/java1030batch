import java.util.Scanner;

class MyChoice
{
	int addition(int x, int y)
	{
		return x+y;
	}

	double addition(double x, double y)
	{
		return x+y;	
	}

	public static void main(String[] args)
	{
		System.out.println("Enter your choice:");
		System.out.println("1. Int \t 2. Double");
		System.out.print("Your choice: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		MyChoice example = new MyChoice();

		if (choice==1)
		{
			System.out.println("Enter two numbers: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = example.addition(a,b);
			System.out.println("Sum of integers: " + c);
		}
		else if (choice ===2)
		{

		}
		else if (choice == 3)
		{
			
		}
		else
		{
			System.out.println("Enter two numbers: ");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = example.addition(a,b);
			System.out.println("Sum of doubles: " + c);
		}
	}
}