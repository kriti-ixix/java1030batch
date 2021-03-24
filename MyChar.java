import java.util.Scanner;

class MyChar
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String[] names = new String[5];

	for (int i=0; i<names.length; i++)
	{
		String x = sc.next();
		names[i] = x;
		System.out.println("Element at " + i + ": " + names[i]);	
	} 

	System.out.println("\nPrinting the array:");

	for (int i=0; i<names.length; i++)
	{
		System.out.println("Element at " + i + ": " + names[i]);	
	}
}
}