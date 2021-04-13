class MyThread extends Thread
{
    //int x=1;

    public void run()
    {
        try
        {
            for (int x=1 ; x<=10 ; x++)
            {
                System.out.println(x);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        MyOtherThread t2 = new MyOtherThread();
        t.start();
        t2.start();
    }    
}

class MyOtherThread extends Thread
{
    public void run()
    {
        try
        {
            for (int x=10 ; x<=100 ; x+=10)
            {
                System.out.println(x);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }  
}
