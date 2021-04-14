class StopTimer implements Runnable
{
    String minutes = "00:", seconds = "", time="";

    @Override
    public void run()
    {
        try 
        {
            for (int x=0; x<=60; x++)
            {
                if (x==60)
                {
                    minutes = "01:";
                    seconds = "00";
                }
                else if (x<10)
                {
                    seconds = "0" + String.valueOf(x);
                }
                else
                {
                    seconds = String.valueOf(x);
                }

                time = minutes + seconds;
                System.out.println(time);   
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
        StopTimer stopTimer = new StopTimer();
        stopTimer.startThread();
    }   
}
