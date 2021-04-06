class Animal //Parent class
{
    String color = "White";

    Animal()
    {
        System.out.println("Animal is created");
    }
    
    void eating()
    {
        System.out.println("Milk...");
    }
}

class Dog extends Animal //Child class
{
    String color = "Black";

    Dog()
    {
        super(); //Calling the constructor of the parent class
        System.out.println("Dog is created");
    }

    void eating()
    {
        System.out.println("Biscuit...");
    }

    void wantsToEat()
    {
        eating();
        super.eating(); //Calling the eating method of the parent class
    }

    void printColor()
    {
        System.out.println(color);
        System.out.println(super.color); //Calling the color variable of the parent class
    }
}

class SuperInheritance 
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.printColor();
        dog.wantsToEat();
    }
}
