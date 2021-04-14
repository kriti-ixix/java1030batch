class RunnableInt implements Runnable
{
    @Override
    public void run()
    {
        try 
        {
            for (int x=0; x<=10; x++)
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

    void startThread()
    {
        Thread t = new Thread(this);
        t.start();
    }

    public static void main(String[] args)
    {
        RunnableInt runnableInt = new RunnableInt();
        runnableInt.startThread();
    }
}