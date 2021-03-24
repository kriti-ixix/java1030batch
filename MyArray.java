class MyArray
{
public static void main(String[] args)
{
	int[] myArray = new int[5];
	/*myArray[0] = 0; myArray[1] = 1;
	myArray[2] = 2; myArray[3] = 3;
	myArray[4] = 4;*/

	for (int i=0; i<=4; i++)
	{
		myArray[i] = i;
	}

	System.out.println("Printing the array:");

	for (int i=0; i<=4; i++)
	{
		System.out.println("Index " + i + ": " + myArray[i]);	
	}

	System.out.println(java.util.Arrays.toString(myArray));
}
}