class Constructors 
{
    int speed, gear;

    //Default constructor
    Constructors()
    {
        speed = 100;
    }

    //Parameterised constructor
    Constructors(int x)
    {
        speed = x;
    }

    public static void main(String[] args)
    {
        //Calling the default constructor
        Constructors example = new Constructors();
        System.out.println(example.speed); 
        
        //Calling the parameterised constructor
        Constructors object = new Constructors(200);
        System.out.println(object.speed);
    }
    
}
