import java.util.Scanner;

public class ControlFlow 
{
    public static void main(String[] args) 
    {
        /*for (int i =0; i<=10; i++) 
        {
            if (i==5)
            {
              //break;
              continue;  
            }
            System.out.println(i);
        }*/

        System.out.println("Choose an option: ");
        System.out.println("1.Add\t2.Sub\t3.Mul\t4.Div");
        Scanner sc = new Scanner(System.in);
        
        while (true)
        {
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            if (choice<5)
            {
                System.out.println("Chosen");
            }
            else
            {
                System.out.println("Invalid option");
                //break;
                continue;
            }
        }

    }   
}
