import java.util.ArrayList;

class MyArrayList2
{
    public static void main(String[] args)
    {
        ArrayList <String> myArr = new ArrayList<>();
        ArrayList <Integer> myRoll = new ArrayList<>();
        
        if (myArr.isEmpty())
        {
            //System.out.println("Arraylist is empty");
        }
        else
        {
            //System.out.println("Not empty");
        }

        myArr.add("Kriti");
        myArr.add("Pooja");
        myArr.add("Parteet");
        
        //System.out.println("Initial values: ");

        for (int i=0; i<myArr.size(); i++)
        {
            //System.out.println(myArr.get(i));
        }

        //System.out.println("\nAfter changing values: ");
        myArr.set(0, "Yashleen");

        for (int i=0; i<myArr.size(); i++)
        {
            //System.out.println(myArr.get(i));
        }

        if (myArr.isEmpty())
        {
            //System.out.println("Arraylist is empty");
        }
        else
        {
            //System.out.println("Not empty");
        }

        String removedValue = myArr.remove(1);
        System.out.println("The removed value was: " + removedValue);

        for (int i=0; i<myArr.size(); i++)
        {
            System.out.println(myArr.get(i));
        }

    }
}