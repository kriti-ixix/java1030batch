class MySumOfArray
{
public static void main(String[] args)
{
	int[] myArr = {1, 2, 3, 4, 5};
	int sum = 0;

	for (int i=0; i<myArr.length; i++)
	{
		sum = sum + myArr[i];
	}

	System.out.println(sum);
}
}