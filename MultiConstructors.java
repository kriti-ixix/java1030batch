class MultiConstructors
{
    public static void main(String[] args)
    {
        Addition addTwo = new Addition(5, 10);
        Addition addThree = new Addition(5, 10, 15);

        Subtraction sub = new Subtraction(10, 5);

        Multiplication mulTwo = new Multiplication(5, 10);
        Multiplication mulThree = new Multiplication(5, 10, 15);

        Division div = new Division(5, 10);

        System.out.println("Addition:");
        System.out.println(addTwo.c);
        System.out.println(addThree.d);

        
    }
}

class Addition 
{
    Addition(int a, int b)
    {
        int c = a + b;
    }

    Addition(int a, int b, int c)
    {
        int d = a+b+c;
    }
}

class Subtraction
{
    Subtraction(int a, int b)
    {
        int c = a - b;
    }
}