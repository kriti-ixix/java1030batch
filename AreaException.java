class AreaException 
{
    public static void main(String[] args)
    {
        try 
        {
            int l= 10, b=-5;
        
            if (l<0 || b<0)
            {
                throw new ArithmeticException("Length and breadth cannot be negative");
            }
            int area = l*b;
            System.out.println("Area is: " + area);
        }
        catch (ArithmeticException e)
        {
            System.out.println("");
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Execution complete");
        }
    }    
}
