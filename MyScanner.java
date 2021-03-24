import java.util.Scanner;

class MyScanner
{
	int a, b;

	int Addition()
	{
		int c = a+b;
		return c;
	}	

	public static void main(String[] args)
	{
		MyScanner object1 = new MyScanner();
		object1.a = 50;
		object1.b = 10;
		int x = object1.Addition();
		System.out.println(x);
	}
}