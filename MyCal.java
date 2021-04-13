import java.util.*;

class MyCal 
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        //Manually changing the date values
        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.YEAR, 2018);
        Date date = cal.getTime();
        System.out.println(date.toString());
    }    
}
