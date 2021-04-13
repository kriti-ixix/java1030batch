import java.util.Date;
import java.text.SimpleDateFormat;

class MyDateTime 
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String cDate = sdf.format(date);
        System.out.println(cDate);
        SimpleDateFormat sdt = new SimpleDateFormat("HH:mm:ss");
        String cTime = sdt.format(date);
        System.out.println(cTime);
    }    
}
