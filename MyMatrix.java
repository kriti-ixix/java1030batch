import java.util.Scanner;

class MyMatrix
{
public static void main(String[] args)
{
	int[][] myMatrix = new int[3][3];
	Scanner sc = new Scanner(System.in);
	
	//Outer loop handling the rows
	for (int row=0; row<3; row++)
	{
		//Inner loop handling the columns
		for (int col=0; col<3; col++)
		{
			int value = sc.nextInt();
			myMatrix[row][col] = value;	
		}
	}

	//Printing out the rows
	for (int row=0; row<3; row++)
	{
		//Inner loop handling the columns
		for (int col=0; col<3; col++)
		{
			int value = myMatrix[row][col];
			System.out.print(value + " ");	
		}
		System.out.println("");
	}
}
}
