class NewDiamond
{
	public static void main(String[] args)
	{
		//Outer loop which handles the rows
		for (int i=1; i<6; i++)
		{
			//Inner loop for white spaces
			for (int s=5; s>=i; s--)
			{
				System.out.print(" ");
			}

			//Stars
			for (int t=1; t<=i; t++)
			{
				System.out.print("*");
			}

			for (int t=1; t<=i; t++)
			{
				System.out.print("*");
			}  
		
			System.out.println("");
		}

		//Outer loop which reverses the pyramid
		for (int i=1; i<6; i++)
		{
			//Inner loop for white spaces
			for (int s=1; s<=i; s++)
			{
				System.out.print(" ");
			}

			//Stars
			for (int t=5; t>=i; t--)
			{
				System.out.print("*");
			}

			for (int t=5; t>=i; t--)
			{
				System.out.print("*");
			}  
		
			System.out.println("");
		}	
	}
}