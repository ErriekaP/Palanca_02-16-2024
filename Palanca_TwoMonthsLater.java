import java.util.Calendar;
import java.util.Date;


public class Palanca_TwoMonthsLater {

    static Date twoMonthsLater(Date date){

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 2);
        return cal.getTime();

    }

    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        cal.set(2014, Calendar.DECEMBER, 31);
        System.out.println(twoMonthsLater(cal.getTime()));
    }
    
}
