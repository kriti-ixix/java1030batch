class MyPalindrome
{
public static void main(String[] args)
{
	int num = 123, rev=0;
	int x = num;

	while(x!=0)
	{
		int remainder = x%10;
		rev = (rev*10) + remainder;
		x = x/10;
	}

	if (num==rev)
	{
		System.out.println("This is a palindrome");
	}

	else
	{
		System.out.println("Not a palindrome");
	}
}
}