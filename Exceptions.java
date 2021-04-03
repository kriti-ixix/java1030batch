import java.util.*;

class Exceptions
{
	public static void main(String[] args)
	{
	try
	{
		int[] arr = {0, 1, 2, 3, 4};
		throw new ArithmeticException();
		//System.out.println(arr[10]);		
	}

	catch(Exception e)
	{
		System.out.println("\ngetMessage()");
		System.out.println(e.getMessage());
		System.out.println("\ntoString()");
		System.out.println(e.toString());
		System.out.println("\nprintStackTrace()");
		e.printStackTrace();
		System.out.println("");
	}
	}
}